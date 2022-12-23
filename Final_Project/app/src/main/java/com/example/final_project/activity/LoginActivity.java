package com.example.final_project.activity;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.final_project.R;

import org.json.JSONArray;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {

    TextView tvSignUp, tvTitle;
    EditText etMail, etPass;
    Button btnLogin;

    String urlValidate = "http://192.168.102.5:8080/mobile_final_service/validate_account.php";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tvSignUp = findViewById(R.id.tvSignUp);
        tvTitle = findViewById(R.id.tvTitle);
        etMail = findViewById(R.id.etMail);
        etPass = findViewById(R.id.etPass);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTitle.setText("success");
                //tvTitle.setText(etMail.getText().toString().trim());
                validateAccount(urlValidate);
            }
        });

        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSignUp(view);
            }
        });
    }

    private void validateAccount(String url){
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        tvTitle.setText(response.toString());
//                        if(response.trim() != "notfound"){
//                            tvTitle.setText(response);
//                            //Toast.makeText(LoginActivity.this, "success", Toast.LENGTH_SHORT).show();
//                        }
//                        else {
//                            tvTitle.setText("not found");
//                            //Toast.makeText(LoginActivity.this, "not found", Toast.LENGTH_SHORT).show();
//                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        tvTitle.setText(error.toString());
                        //Toast.makeText(LoginActivity.this, "error", Toast.LENGTH_SHORT).show();
                    }
                }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<>();
                params.put("email",etMail.getText().toString().trim());
                params.put("password",etPass.getText().toString().trim());
                return super.getParams();
            }
        };
    }

    private void goToSignUp(View view){
        Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
        startActivity(intent);
    }
}

package com.example.final_project.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.final_project.R;

public class SignupActivity extends AppCompatActivity {
    private EditText edtEmail, edtPassword, edtConfirmPassword;
    private Button btnSignup;

    //    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

//        mAuth = FirebaseAuth.getInstance();
        edtEmail = findViewById(R.id.edt_email);
        edtPassword = findViewById(R.id.edt_password);
        edtConfirmPassword = findViewById(R.id.edt_confirmPassword);
        btnSignup = findViewById(R.id.btn_login);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signup();
            }
        });
}

    private void signup() {
        String email, password, confirm;
        email = edtEmail.getText().toString();
        password = edtPassword.getText().toString();
        confirm = edtConfirmPassword.getText().toString();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Vui lòng nhập email !!!", Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Vui lòng nhập mật khẩu !!!", Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(confirm)) {
            Toast.makeText(this, "Vui lòng nhắc lại mật khẩu !!!", Toast.LENGTH_LONG).show();
            return;
        }

        if(confirm != password) {
            Toast.makeText(this, "Vui lòng nhắc lại đúng mật khẩu !!!", Toast.LENGTH_LONG).show();
            return;
        }
//        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult> () {
//            @Override
//            public void onComplete(@NonNull @NonNull Task<AuthResult> task) {
//                if(task.isSuccessful()) {
//                    Toast.makeText(getApplicationContext(), "Tạo tài khoản thành công", Toast.LENGTH_LONG).show();
//                    Intent intent = new Intent(SignupActivity.this, MainActivity.class);
//                    startActivity(intent);
//                }
//
//                else {
//                    Toast.makeText(getApplicationContext(), "Tạo tài khoản thất bại", Toast.LENGTH_LONG).show();
//                }
//            }
//        })
    }
}

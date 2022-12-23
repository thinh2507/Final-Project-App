package com.example.final_project.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.final_project.R;
import com.example.final_project.adapter.ProductAdapter;
import com.example.final_project.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProductFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProductFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView productRV;
    private ProductAdapter productAdapter;

    public ProductFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProductFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProductFragment newInstance(String param1, String param2) {
        ProductFragment fragment = new ProductFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        productRV = view.findViewById(R.id.productRV);
        productAdapter = new ProductAdapter(getActivity());
//
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        productRV.setLayoutManager(gridLayoutManager);
//
        productAdapter.setData(getProdList());
        TextView demo = view.findViewById(R.id.tvTest);
        demo.setText(getProdList().get(1).getProdName());
        //productRV.setAdapter(productAdapter);
    }

    private List<Product> getProdList(){
        List<Product> list = new ArrayList<>();
        list.add(new Product("Banh mi", 22000, R.drawable.bakery_01));
        list.add(new Product("Banh mi", 22000, R.drawable.bakery_01));
        list.add(new Product("Banh mi", 22000, R.drawable.bakery_01));
        list.add(new Product("Banh mi", 22000, R.drawable.bakery_01));
        list.add(new Product("Banh mi", 22000, R.drawable.bakery_01));
        return list;
    }
}
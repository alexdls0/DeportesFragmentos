package com.example.deportesfragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class FragmentMenu extends Fragment {

    private final static String OPCION = "deportesfragment.OPCION";

    private ImageView ivBasket, ivCycling, ivMartial;
    private ImageView ivFragment2;
    private Button btLanzar;
    private String opcion;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment_menu, container, false);

        ivBasket = v.findViewById(R.id.ivBasket);
        ivCycling = v.findViewById(R.id.ivCycling);
        ivMartial = v.findViewById(R.id.ivMartial);
        opcion = "";

        ivBasket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivFragment2 = getActivity().findViewById(R.id.ivFragment2);
                ivFragment2.setImageResource(R.drawable.basket);
                opcion = "basket";

                btLanzar = getActivity().findViewById(R.id.btLanzar);
                btLanzar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getContext(), FamosoActivity.class);
                        i.putExtra(OPCION, opcion);
                        startActivity(i);
                    }
                });
            }
        });

        ivCycling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivFragment2 = getActivity().findViewById(R.id.ivFragment2);
                ivFragment2.setImageResource(R.drawable.cycling);
                opcion = "cycling";

                btLanzar = getActivity().findViewById(R.id.btLanzar);
                btLanzar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getContext(), FamosoActivity.class);
                        i.putExtra(OPCION, opcion);
                        startActivity(i);
                    }
                });
            }
        });

        ivMartial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivFragment2 = getActivity().findViewById(R.id.ivFragment2);
                ivFragment2.setImageResource(R.drawable.martialarts);
                opcion = "martial";

                btLanzar = getActivity().findViewById(R.id.btLanzar);
                btLanzar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getContext(), FamosoActivity.class);
                        i.putExtra(OPCION, opcion);
                        startActivity(i);
                    }
                });
            }
        });

        return v;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("opcionPrevia",opcion);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            if(savedInstanceState.getString("opcionPrevia").equalsIgnoreCase("basket")){
                ivFragment2 = getActivity().findViewById(R.id.ivFragment2);
                ivFragment2.setImageResource(R.drawable.basket);
                opcion = "basket";

                btLanzar = getActivity().findViewById(R.id.btLanzar);
                btLanzar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getContext(), FamosoActivity.class);
                        i.putExtra(OPCION, opcion);
                        startActivity(i);
                    }
                });
            }

            if(savedInstanceState.getString("opcionPrevia").equalsIgnoreCase("cycling")){
                ivFragment2 = getActivity().findViewById(R.id.ivFragment2);
                ivFragment2.setImageResource(R.drawable.cycling);
                opcion = "cycling";

                btLanzar = getActivity().findViewById(R.id.btLanzar);
                btLanzar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getContext(), FamosoActivity.class);
                        i.putExtra(OPCION, opcion);
                        startActivity(i);
                    }
                });
            }

            if(savedInstanceState.getString("opcionPrevia").equalsIgnoreCase("martial")){
                ivFragment2 = getActivity().findViewById(R.id.ivFragment2);
                ivFragment2.setImageResource(R.drawable.martialarts);
                opcion = "martial";

                btLanzar = getActivity().findViewById(R.id.btLanzar);
                btLanzar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getContext(), FamosoActivity.class);
                        i.putExtra(OPCION, opcion);
                        startActivity(i);
                    }
                });
            }
        }
    }
}

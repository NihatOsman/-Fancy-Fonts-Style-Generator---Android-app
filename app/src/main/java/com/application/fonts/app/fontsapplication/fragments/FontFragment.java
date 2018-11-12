package com.application.fonts.app.fontsapplication.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.application.fonts.app.fontsapplication.R;
import com.application.fonts.app.fontsapplication.adapters.FontAdapter;
import com.application.fonts.app.fontsapplication.model.Font;

import java.util.ArrayList;


public class FontFragment extends Fragment {
    private Activity context;
    private RecyclerView fontsRV;
    private ArrayList<Font> fontsItems = new ArrayList<>();
    private EditText editText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_font, container, false);

        if (fontsItems.isEmpty()) {

            final Font f1 = new Font("Bubble");
            final Font f2 = new Font("Currency");
            final Font f3 = new Font("Magic");
            final Font f4 = new Font("Knight");
            final Font f5 = new Font("Antrophobia");
            final Font f6 = new Font("Fancy style 1");
            final Font f7 = new Font("Fancy style 2");
            final Font f8 = new Font("Fancy style 3");
            final Font f9 = new Font("Fancy style 4");
            final Font f10 = new Font("Fancy style 5");
            final Font f11 = new Font("Fancy style 6");
            final Font f12 = new Font("Fancy style 7");
            final Font f13 = new Font("Fancy style 8");
            final Font f14 = new Font("Fancy style 9");
            final Font f15 = new Font("Fancy style 10");
            final Font f16 = new Font("Fancy style 11");
            final Font f17 = new Font("Fancy style 12");
            final Font f18 = new Font("Fancy style 13");
            final Font f19 = new Font("Fancy style 14");
            final Font f20 = new Font("Fancy style 15");
            final Font f21 = new Font("Aries");
            final Font f22 = new Font("Taurus");
            final Font f23 = new Font("Gemini");
            final Font f24 = new Font("Cancer");
            final Font f25 = new Font("Leo");
            final Font f26 = new Font("Virgo");
            final Font f27 = new Font("Libra");
            final Font f28 = new Font("Scorpius");
            final Font f29 = new Font("Sagittarius");
            final Font f30 = new Font("Capricorn");
            final Font f31 = new Font("Aquarius");
            final Font f32 = new Font("Pisces");

            fontsItems.add(f1);
            fontsItems.add(f2);
            fontsItems.add(f3);
            fontsItems.add(f4);
            fontsItems.add(f5);
            fontsItems.add(f6);
            fontsItems.add(f7);
            fontsItems.add(f8);
            fontsItems.add(f9);
            fontsItems.add(f10);
            fontsItems.add(f11);
            fontsItems.add(f12);
            fontsItems.add(f13);
            fontsItems.add(f14);
            fontsItems.add(f15);
            fontsItems.add(f16);
            fontsItems.add(f17);
            fontsItems.add(f18);
            fontsItems.add(f19);
            fontsItems.add(f20);
            fontsItems.add(f21);
            fontsItems.add(f22);
            fontsItems.add(f23);
            fontsItems.add(f24);
            fontsItems.add(f25);
            fontsItems.add(f26);
            fontsItems.add(f27);
            fontsItems.add(f28);
            fontsItems.add(f29);
            fontsItems.add(f30);
            fontsItems.add(f31);
            fontsItems.add(f32);

        } else {
            fontsItems.clear();
            final Font f1 = new Font("Bubble");
            final Font f2 = new Font("Currency");
            final Font f3 = new Font("Magic");
            final Font f4 = new Font("Knight");
            final Font f5 = new Font("Antrophobia");
            final Font f6 = new Font("Fancy style 1");
            final Font f7 = new Font("Fancy style 2");
            final Font f8 = new Font("Fancy style 3");
            final Font f9 = new Font("Fancy style 4");
            final Font f10 = new Font("Fancy style 5");
            final Font f11 = new Font("Fancy style 6");
            final Font f12 = new Font("Fancy style 7");
            final Font f13 = new Font("Fancy style 8");
            final Font f14 = new Font("Fancy style 9");
            final Font f15 = new Font("Fancy style 10");
            final Font f16 = new Font("Fancy style 11");
            final Font f17 = new Font("Fancy style 12");
            final Font f18 = new Font("Fancy style 13");
            final Font f19 = new Font("Fancy style 14");
            final Font f20 = new Font("Fancy style 15");
            final Font f21 = new Font("Aries");
            final Font f22 = new Font("Taurus");
            final Font f23 = new Font("Gemini");
            final Font f24 = new Font("Cancer");
            final Font f25 = new Font("Leo");
            final Font f26 = new Font("Virgo");
            final Font f27 = new Font("Libra");
            final Font f28 = new Font("Scorpius");
            final Font f29 = new Font("Sagittarius");
            final Font f30 = new Font("Capricorn");
            final Font f31 = new Font("Aquarius");
            final Font f32 = new Font("Pisces");

            fontsItems.add(f1);
            fontsItems.add(f2);
            fontsItems.add(f3);
            fontsItems.add(f4);
            fontsItems.add(f5);
            fontsItems.add(f6);
            fontsItems.add(f7);
            fontsItems.add(f8);
            fontsItems.add(f9);
            fontsItems.add(f10);
            fontsItems.add(f11);
            fontsItems.add(f12);
            fontsItems.add(f13);
            fontsItems.add(f14);
            fontsItems.add(f15);
            fontsItems.add(f16);
            fontsItems.add(f17);
            fontsItems.add(f18);
            fontsItems.add(f19);
            fontsItems.add(f20);
            fontsItems.add(f21);
            fontsItems.add(f22);
            fontsItems.add(f23);
            fontsItems.add(f24);
            fontsItems.add(f25);
            fontsItems.add(f26);
            fontsItems.add(f27);
            fontsItems.add(f28);
            fontsItems.add(f29);
            fontsItems.add(f30);
            fontsItems.add(f31);
            fontsItems.add(f32);
        }






        fontsRV = view.findViewById(R.id.recycle_view_FF);

        final FontAdapter adapter = new FontAdapter(fontsItems, context);
        fontsRV.setLayoutManager(new LinearLayoutManager(context));
        fontsRV.setAdapter(adapter);

        editText = view.findViewById(R.id.edit_text_FF);
        editText.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String editTextStr = editText.getText().toString();

                if (editTextStr.isEmpty() || editTextStr.equals(" ")) {
                    editTextStr = "Preview text";
                }

                for (int item = 0; item < fontsItems.size(); item++) {
                    fontsItems.get(item).setPreviewText(editTextStr);
                    adapter.notifyDataSetChanged();


                }
            }
        });


        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = (Activity) context;
    }

}

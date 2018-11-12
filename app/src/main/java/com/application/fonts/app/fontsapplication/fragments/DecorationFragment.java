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
import com.application.fonts.app.fontsapplication.adapters.DecorationAdapter;
import com.application.fonts.app.fontsapplication.model.Font;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DecorationFragment extends Fragment {


    public DecorationFragment() {
        // Required empty public constructor
    }

    private Activity context;
    private RecyclerView fontsRV;
    private ArrayList<Font> decorationFonts = new ArrayList<>();
    private EditText editText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_decoration, container, false);

        if (decorationFonts.isEmpty()) {

            final Font f1 = new Font("Decoration 1");
            final Font f2 = new Font("Decoration 2");
            final Font f3 = new Font("Decoration 3");
            final Font f4 = new Font("Decoration 4");
            final Font f5 = new Font("Decoration 5");
            final Font f6 = new Font("Decoration 6");
            final Font f7 = new Font("Decoration 7");
            final Font f8 = new Font("Decoration 8");
            final Font f9 = new Font("Decoration 9");
            final Font f10 = new Font("Decoration 10");
            final Font f11 = new Font("Decoration 11");
            final Font f12 = new Font("Decoration 12");
            final Font f13 = new Font("Decoration 13");
            final Font f14 = new Font("Decoration 14");
            final Font f15 = new Font("Decoration 15");
            final Font f16 = new Font("Decoration 16");
            final Font f17 = new Font("Decoration 17");
            final Font f18 = new Font("Decoration 18");
            final Font f19 = new Font("Decoration 19");
            final Font f20 = new Font("Decoration 20");
            final Font f21 = new Font("Decoration 21");
            final Font f22 = new Font("Decoration 22");
            final Font f23 = new Font("Decoration 23");
            final Font f24 = new Font("Decoration 24");
            final Font f25 = new Font("Decoration 25");
            final Font f26 = new Font("Decoration 26");
            final Font f27 = new Font("Decoration 27");
            final Font f28 = new Font("Decoration 28");
            final Font f29 = new Font("Decoration 29");
            final Font f30 = new Font("Decoration 30");
            final Font f31 = new Font("Decoration 31");
            final Font f32 = new Font("Decoration 32");
            final Font f33 = new Font("Decoration 33");
            final Font f34 = new Font("Decoration 34");
            final Font f35 = new Font("Decoration 35");
            final Font f36 = new Font("Decoration 36");
            final Font f37 = new Font("Decoration 37");
            final Font f38 = new Font("Decoration 38");
            final Font f39 = new Font("Decoration 39");
            final Font f40 = new Font("Decoration 40");
            final Font f41 = new Font("Decoration 41");
            final Font f42 = new Font("Decoration 42");
            final Font f43 = new Font("Decoration 43");
            final Font f44 = new Font("Decoration 44");
            final Font f45 = new Font("Decoration 45");
            final Font f46 = new Font("Decoration 46");
            final Font f47 = new Font("Decoration 47");
            final Font f48 = new Font("Decoration 48");
            final Font f49 = new Font("Decoration 49");
            final Font f50 = new Font("Decoration 50");
            final Font f51 = new Font("Decoration 51");
            final Font f52 = new Font("Decoration 52");
            final Font f53 = new Font("Decoration 53");
            final Font f54 = new Font("Decoration 54");
            final Font f55 = new Font("Decoration 55");
            final Font f56 = new Font("Decoration 56");
            final Font f57 = new Font("Decoration 57");
            final Font f58 = new Font("Decoration 58");
            final Font f59 = new Font("Decoration 59");
            final Font f60 = new Font("Decoration 60");
            final Font f61 = new Font("Decoration 61");
            final Font f62 = new Font("Decoration 62");
            final Font f63 = new Font("Decoration 63");
            final Font f64 = new Font("Decoration 64");
            final Font f65 = new Font("Decoration 65");
            final Font f66 = new Font("Decoration 66");
            final Font f67 = new Font("Decoration 67");
            final Font f68 = new Font("Decoration 68");
            final Font f69 = new Font("Decoration 69");
            final Font f70 = new Font("Decoration 70");
            final Font f71 = new Font("Decoration 71");
            final Font f72 = new Font("Decoration 72");
            final Font f73 = new Font("Decoration 73");
            final Font f74 = new Font("Decoration 74");
            final Font f75 = new Font("Decoration 75");
            final Font f76 = new Font("Decoration 76");
            final Font f77 = new Font("Decoration 77");
            final Font f78 = new Font("Decoration 78");
            final Font f79 = new Font("Decoration 79");
            final Font f80 = new Font("Decoration 80");
            final Font f81 = new Font("Decoration 81");
            final Font f82 = new Font("Decoration 82");
            final Font f83 = new Font("Decoration 83");
            final Font f84 = new Font("Decoration 84");
            final Font f85 = new Font("Decoration 85");
            final Font f86 = new Font("Decoration 86");
            final Font f87 = new Font("Decoration 87");
            final Font f88 = new Font("Decoration 88");
            final Font f89 = new Font("Decoration 89");
            final Font f90 = new Font("Decoration 90");
            final Font f91 = new Font("Decoration 91");
            final Font f92 = new Font("Decoration 92");
            final Font f93 = new Font("Decoration 93");
            final Font f94 = new Font("Decoration 94");
            final Font f95 = new Font("Decoration 95");
            final Font f96 = new Font("Decoration 96");
            final Font f97 = new Font("Decoration 97");
            final Font f98 = new Font("Decoration 98");
            final Font f99 = new Font("Decoration 99");


            decorationFonts.add(f1);
            decorationFonts.add(f2);
            decorationFonts.add(f3);
            decorationFonts.add(f4);
            decorationFonts.add(f5);
            decorationFonts.add(f6);
            decorationFonts.add(f7);
            decorationFonts.add(f8);
            decorationFonts.add(f9);
            decorationFonts.add(f10);
            decorationFonts.add(f11);
            decorationFonts.add(f12);
            decorationFonts.add(f13);
            decorationFonts.add(f14);
            decorationFonts.add(f15);
            decorationFonts.add(f16);
            decorationFonts.add(f17);
            decorationFonts.add(f18);
            decorationFonts.add(f19);
            decorationFonts.add(f20);
            decorationFonts.add(f21);
            decorationFonts.add(f22);
            decorationFonts.add(f23);
            decorationFonts.add(f24);
            decorationFonts.add(f25);
            decorationFonts.add(f26);
            decorationFonts.add(f27);
            decorationFonts.add(f28);
            decorationFonts.add(f29);
            decorationFonts.add(f30);
            decorationFonts.add(f31);
            decorationFonts.add(f32);
            decorationFonts.add(f33);
            decorationFonts.add(f34);
            decorationFonts.add(f35);
            decorationFonts.add(f36);
            decorationFonts.add(f37);
            decorationFonts.add(f38);
            decorationFonts.add(f39);
            decorationFonts.add(f40);
            decorationFonts.add(f41);
            decorationFonts.add(f42);
            decorationFonts.add(f43);
            decorationFonts.add(f44);
            decorationFonts.add(f45);
            decorationFonts.add(f46);
            decorationFonts.add(f47);
            decorationFonts.add(f48);
            decorationFonts.add(f49);
            decorationFonts.add(f50);
            decorationFonts.add(f51);
            decorationFonts.add(f52);
            decorationFonts.add(f53);
            decorationFonts.add(f54);
            decorationFonts.add(f55);
            decorationFonts.add(f56);
            decorationFonts.add(f57);
            decorationFonts.add(f58);
            decorationFonts.add(f59);
            decorationFonts.add(f60);
            decorationFonts.add(f61);
            decorationFonts.add(f62);
            decorationFonts.add(f63);
            decorationFonts.add(f64);
            decorationFonts.add(f65);
            decorationFonts.add(f66);
            decorationFonts.add(f67);
            decorationFonts.add(f68);
            decorationFonts.add(f69);
            decorationFonts.add(f70);
            decorationFonts.add(f71);
            decorationFonts.add(f72);
            decorationFonts.add(f73);
            decorationFonts.add(f74);
            decorationFonts.add(f75);
            decorationFonts.add(f76);
            decorationFonts.add(f77);
            decorationFonts.add(f78);
            decorationFonts.add(f79);
            decorationFonts.add(f80);
            decorationFonts.add(f81);
            decorationFonts.add(f82);
            decorationFonts.add(f83);
            decorationFonts.add(f84);
            decorationFonts.add(f85);
            decorationFonts.add(f86);
            decorationFonts.add(f87);
            decorationFonts.add(f88);
            decorationFonts.add(f89);
            decorationFonts.add(f90);
            decorationFonts.add(f91);
            decorationFonts.add(f92);
            decorationFonts.add(f93);
            decorationFonts.add(f94);
            decorationFonts.add(f95);
            decorationFonts.add(f96);
            decorationFonts.add(f97);
            decorationFonts.add(f98);
            decorationFonts.add(f99);


        }
        else{
            decorationFonts.clear();
            final Font f1 = new Font("Decoration 1");
            final Font f2 = new Font("Decoration 2");
            final Font f3 = new Font("Decoration 3");
            final Font f4 = new Font("Decoration 4");
            final Font f5 = new Font("Decoration 5");
            final Font f6 = new Font("Decoration 6");
            final Font f7 = new Font("Decoration 7");
            final Font f8 = new Font("Decoration 8");
            final Font f9 = new Font("Decoration 9");
            final Font f10 = new Font("Decoration 10");
            final Font f11 = new Font("Decoration 11");
            final Font f12 = new Font("Decoration 12");
            final Font f13 = new Font("Decoration 13");
            final Font f14 = new Font("Decoration 14");
            final Font f15 = new Font("Decoration 15");
            final Font f16 = new Font("Decoration 16");
            final Font f17 = new Font("Decoration 17");
            final Font f18 = new Font("Decoration 18");
            final Font f19 = new Font("Decoration 19");
            final Font f20 = new Font("Decoration 20");
            final Font f21 = new Font("Decoration 21");
            final Font f22 = new Font("Decoration 22");
            final Font f23 = new Font("Decoration 23");
            final Font f24 = new Font("Decoration 24");
            final Font f25 = new Font("Decoration 25");
            final Font f26 = new Font("Decoration 26");
            final Font f27 = new Font("Decoration 27");
            final Font f28 = new Font("Decoration 28");
            final Font f29 = new Font("Decoration 29");
            final Font f30 = new Font("Decoration 30");
            final Font f31 = new Font("Decoration 31");
            final Font f32 = new Font("Decoration 32");
            final Font f33 = new Font("Decoration 33");
            final Font f34 = new Font("Decoration 34");
            final Font f35 = new Font("Decoration 35");
            final Font f36 = new Font("Decoration 36");
            final Font f37 = new Font("Decoration 37");
            final Font f38 = new Font("Decoration 38");
            final Font f39 = new Font("Decoration 39");
            final Font f40 = new Font("Decoration 40");
            final Font f41 = new Font("Decoration 41");
            final Font f42 = new Font("Decoration 42");
            final Font f43 = new Font("Decoration 43");
            final Font f44 = new Font("Decoration 44");
            final Font f45 = new Font("Decoration 45");
            final Font f46 = new Font("Decoration 46");
            final Font f47 = new Font("Decoration 47");
            final Font f48 = new Font("Decoration 48");
            final Font f49 = new Font("Decoration 49");
            final Font f50 = new Font("Decoration 50");
            final Font f51 = new Font("Decoration 51");
            final Font f52 = new Font("Decoration 52");
            final Font f53 = new Font("Decoration 53");
            final Font f54 = new Font("Decoration 54");
            final Font f55 = new Font("Decoration 55");
            final Font f56 = new Font("Decoration 56");
            final Font f57 = new Font("Decoration 57");
            final Font f58 = new Font("Decoration 58");
            final Font f59 = new Font("Decoration 59");
            final Font f60 = new Font("Decoration 60");
            final Font f61 = new Font("Decoration 61");
            final Font f62 = new Font("Decoration 62");
            final Font f63 = new Font("Decoration 63");
            final Font f64 = new Font("Decoration 64");
            final Font f65 = new Font("Decoration 65");
            final Font f66 = new Font("Decoration 66");
            final Font f67 = new Font("Decoration 67");
            final Font f68 = new Font("Decoration 68");
            final Font f69 = new Font("Decoration 69");
            final Font f70 = new Font("Decoration 70");
            final Font f71 = new Font("Decoration 71");
            final Font f72 = new Font("Decoration 72");
            final Font f73 = new Font("Decoration 73");
            final Font f74 = new Font("Decoration 74");
            final Font f75 = new Font("Decoration 75");
            final Font f76 = new Font("Decoration 76");
            final Font f77 = new Font("Decoration 77");
            final Font f78 = new Font("Decoration 78");
            final Font f79 = new Font("Decoration 79");
            final Font f80 = new Font("Decoration 80");
            final Font f81 = new Font("Decoration 81");
            final Font f82 = new Font("Decoration 82");
            final Font f83 = new Font("Decoration 83");
            final Font f84 = new Font("Decoration 84");
            final Font f85 = new Font("Decoration 85");
            final Font f86 = new Font("Decoration 86");
            final Font f87 = new Font("Decoration 87");
            final Font f88 = new Font("Decoration 88");
            final Font f89 = new Font("Decoration 89");
            final Font f90 = new Font("Decoration 90");
            final Font f91 = new Font("Decoration 91");
            final Font f92 = new Font("Decoration 92");
            final Font f93 = new Font("Decoration 93");
            final Font f94 = new Font("Decoration 94");
            final Font f95 = new Font("Decoration 95");
            final Font f96 = new Font("Decoration 96");
            final Font f97 = new Font("Decoration 97");
            final Font f98 = new Font("Decoration 98");
            final Font f99 = new Font("Decoration 99");


            decorationFonts.add(f1);
            decorationFonts.add(f2);
            decorationFonts.add(f3);
            decorationFonts.add(f4);
            decorationFonts.add(f5);
            decorationFonts.add(f6);
            decorationFonts.add(f7);
            decorationFonts.add(f8);
            decorationFonts.add(f9);
            decorationFonts.add(f10);
            decorationFonts.add(f11);
            decorationFonts.add(f12);
            decorationFonts.add(f13);
            decorationFonts.add(f14);
            decorationFonts.add(f15);
            decorationFonts.add(f16);
            decorationFonts.add(f17);
            decorationFonts.add(f18);
            decorationFonts.add(f19);
            decorationFonts.add(f20);
            decorationFonts.add(f21);
            decorationFonts.add(f22);
            decorationFonts.add(f23);
            decorationFonts.add(f24);
            decorationFonts.add(f25);
            decorationFonts.add(f26);
            decorationFonts.add(f27);
            decorationFonts.add(f28);
            decorationFonts.add(f29);
            decorationFonts.add(f30);
            decorationFonts.add(f31);
            decorationFonts.add(f32);
            decorationFonts.add(f33);
            decorationFonts.add(f34);
            decorationFonts.add(f35);
            decorationFonts.add(f36);
            decorationFonts.add(f37);
            decorationFonts.add(f38);
            decorationFonts.add(f39);
            decorationFonts.add(f40);
            decorationFonts.add(f41);
            decorationFonts.add(f42);
            decorationFonts.add(f43);
            decorationFonts.add(f44);
            decorationFonts.add(f45);
            decorationFonts.add(f46);
            decorationFonts.add(f47);
            decorationFonts.add(f48);
            decorationFonts.add(f49);
            decorationFonts.add(f50);
            decorationFonts.add(f51);
            decorationFonts.add(f52);
            decorationFonts.add(f53);
            decorationFonts.add(f54);
            decorationFonts.add(f55);
            decorationFonts.add(f56);
            decorationFonts.add(f57);
            decorationFonts.add(f58);
            decorationFonts.add(f59);
            decorationFonts.add(f60);
            decorationFonts.add(f61);
            decorationFonts.add(f62);
            decorationFonts.add(f63);
            decorationFonts.add(f64);
            decorationFonts.add(f65);
            decorationFonts.add(f66);
            decorationFonts.add(f67);
            decorationFonts.add(f68);
            decorationFonts.add(f69);
            decorationFonts.add(f70);
            decorationFonts.add(f71);
            decorationFonts.add(f72);
            decorationFonts.add(f73);
            decorationFonts.add(f74);
            decorationFonts.add(f75);
            decorationFonts.add(f76);
            decorationFonts.add(f77);
            decorationFonts.add(f78);
            decorationFonts.add(f79);
            decorationFonts.add(f80);
            decorationFonts.add(f81);
            decorationFonts.add(f82);
            decorationFonts.add(f83);
            decorationFonts.add(f84);
            decorationFonts.add(f85);
            decorationFonts.add(f86);
            decorationFonts.add(f87);
            decorationFonts.add(f88);
            decorationFonts.add(f89);
            decorationFonts.add(f90);
            decorationFonts.add(f91);
            decorationFonts.add(f92);
            decorationFonts.add(f93);
            decorationFonts.add(f94);
            decorationFonts.add(f95);
            decorationFonts.add(f96);
            decorationFonts.add(f97);
            decorationFonts.add(f98);
            decorationFonts.add(f99);

        }

        fontsRV = view.findViewById(R.id.recycle_view_DF);

        final DecorationAdapter adapter = new DecorationAdapter(decorationFonts, context);
        fontsRV.setLayoutManager(new LinearLayoutManager(context));
        fontsRV.setAdapter(adapter);

        editText = view.findViewById(R.id.edit_text_DF);
        editText.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String editTextStr = editText.getText().toString();

                if (editTextStr.isEmpty()) {
                    editTextStr = "Preview text";
                }

                for (int item = 0; item < decorationFonts.size(); item++) {
                    decorationFonts.get(item).setPreviewText(editTextStr);
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

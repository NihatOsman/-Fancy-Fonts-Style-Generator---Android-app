package com.application.fonts.app.fontsapplication.adapters;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.application.fonts.app.fontsapplication.R;
import com.application.fonts.app.fontsapplication.model.Font;

import java.util.ArrayList;

import static android.content.Context.CLIPBOARD_SERVICE;


public class DecorationAdapter extends RecyclerView.Adapter<DecorationAdapter.MyViewHolder> {
    private ArrayList<Font> decorationFonts;
    private Activity activity;

    @Override
    @NonNull
    public DecorationAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(activity).inflate(R.layout.adapter_decoration, parent, false);
        return new MyViewHolder(row);
    }

    public DecorationAdapter(ArrayList<Font> fontItems, Activity activity) {
        this.decorationFonts = fontItems;
        this.activity = activity;

    }

    @Override
    public void onBindViewHolder(@NonNull final DecorationAdapter.MyViewHolder holder, final int position) {
        final Font f = decorationFonts.get(position);
        holder.title.setText(f.getFontName());
        StringBuilder strBld = new StringBuilder(f.getPreviewText());
        switch (position) {
            case 0:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "★·.·´¯`·.·★");
                    strBld.insert(strBld.length(), "★·.·´¯`·.·★");
                } else if (!f.getPreviewText().contains("★·.·´¯`·.·★")) {
                    strBld.insert(0, "★·.·´¯`·.·★");
                    strBld.insert(strBld.length(), "★·.·´¯`·.·★");
                }

                break;

            case 1:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "✦͙͙͙*͙*❥⃝∗⁎.ʚ");
                    strBld.insert(strBld.length(), "ɞ.⁎∗❥⃝**͙✦͙͙͙");
                } else if (!f.getPreviewText().contains("✦͙͙͙*͙*❥⃝∗⁎.ʚ")) {
                    strBld.insert(0, "✦͙͙͙*͙*❥⃝∗⁎.ʚ");
                    strBld.insert(strBld.length(), "ɞ.⁎∗❥⃝**͙✦͙͙͙");
                }
                break;
            case 2:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "▁ ▂ ▄ ▅ ▆ ▇ █ ");
                    strBld.insert(strBld.length(), "█ ▇ ▆ ▅ ▄ ▂ ▁");
                } else if (!f.getPreviewText().contains("█ ▇ ▆ ▅ ▄ ▂ ▁")) {
                    strBld.insert(0, "▁ ▂ ▄ ▅ ▆ ▇ █");
                    strBld.insert(strBld.length(), "█ ▇ ▆ ▅ ▄ ▂ ▁");
                }
                break;
            case 3:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "¸¸♬·¯·♩¸¸♪·¯·♫¸¸");
                    strBld.insert(strBld.length(), "¸¸♫·¯·♪¸¸♩·¯·♬¸¸");
                } else if (!f.getPreviewText().contains("¸¸♬·¯·♩¸¸♪·¯·♫¸¸")) {
                    strBld.insert(0, "¸¸♬·¯·♩¸¸♪·¯·♫¸¸");
                    strBld.insert(strBld.length(), "¸¸♫·¯·♪¸¸♩·¯·♬¸¸");
                }
                break;

            case 4:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "{♥‿♥}");
                    strBld.insert(strBld.length(), "{♥‿♥}");
                } else if (!f.getPreviewText().contains("{♥‿♥}")) {
                    strBld.insert(0, "{♥‿♥}");
                    strBld.insert(strBld.length(), "{♥‿♥}");
                }
                break;

            case 5:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "✿◕ ‿ ◕✿");
                    strBld.insert(strBld.length(), "✿◕ ‿ ◕✿");
                } else if (!f.getPreviewText().contains("✿◕ ‿ ◕✿")) {
                    strBld.insert(0, "✿◕ ‿ ◕✿");
                    strBld.insert(strBld.length(), "✿◕ ‿ ◕✿");
                }
                break;

            case 6:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "웃❤유");
                    strBld.insert(strBld.length(), "유❤웃");
                } else if (!f.getPreviewText().contains("웃❤유")) {
                    strBld.insert(0, "웃❤유");
                    strBld.insert(strBld.length(), "유❤웃");
                }
                break;

            case 7:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "✿.｡.:* ☆:**:.");
                    strBld.insert(strBld.length(), ".:**:.☆*.:｡.✿");
                } else if (!f.getPreviewText().contains("✿.｡.:* ☆:**:.")) {
                    strBld.insert(0, "✿.｡.:* ☆:**:.");
                    strBld.insert(strBld.length(), ".:**:.☆*.:｡.✿");
                }
                break;

            case 8:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "¤¸¸.•´¯`•¸¸.•..>>");
                    strBld.insert(strBld.length(), "<<..•.¸¸•´¯`•.¸¸¤");
                } else if (!f.getPreviewText().contains("¤¸¸.•´¯`•¸¸.•..>>")) {
                    strBld.insert(0, "¤¸¸.•´¯`•¸¸.•..>>");
                    strBld.insert(strBld.length(), "<<..•.¸¸•´¯`•.¸¸¤");
                }
                break;

            case 9:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "◦•●◉✿");
                    strBld.insert(strBld.length(), "✿◉●•◦");
                } else if (!f.getPreviewText().contains("◦•●◉✿")) {
                    strBld.insert(0, "◦•●◉✿");
                    strBld.insert(strBld.length(), "✿◉●•◦");
                }
                break;

            case 10:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "▀▄▀▄▀▄");
                    strBld.insert(strBld.length(), "▄▀▄▀▄▀");
                } else if (!f.getPreviewText().contains("▀▄▀▄▀▄")) {
                    strBld.insert(0, "▀▄▀▄▀▄");
                    strBld.insert(strBld.length(), "▄▀▄▀▄▀");
                }
                break;
            case 11:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, ".•°¤*(¯`★´¯)*¤°");
                    strBld.insert(strBld.length(), "°¤*(¯´★`¯)*¤°•.");
                } else if (!f.getPreviewText().contains(".•°¤*(¯`★´¯)*¤°")) {
                    strBld.insert(0, ".•°¤*(¯`★´¯)*¤°");
                    strBld.insert(strBld.length(), "°¤*(¯´★`¯)*¤°•.");
                }
                break;

            case 12:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "☆(❁‿❁)☆");
                    strBld.insert(strBld.length(), "☆(❁‿❁)☆");
                } else if (!f.getPreviewText().contains("☆(❁‿❁)☆")) {
                    strBld.insert(0, "☆(❁‿❁)☆");
                    strBld.insert(strBld.length(), "☆(❁‿❁)☆");
                }
                break;

            case 13:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "ღ(¯`◕‿◕´¯) ♫ ♪ ♫");
                    strBld.insert(strBld.length(), "♫ ♪ ♫ (¯`◕‿◕´¯)ღ");
                } else if (!f.getPreviewText().contains("ღ(¯`◕‿◕´¯) ♫ ♪ ♫")) {
                    strBld.insert(0, "ღ(¯`◕‿◕´¯) ♫ ♪ ♫");
                    strBld.insert(strBld.length(), "♫ ♪ ♫ (¯`◕‿◕´¯)ღ");
                }
                break;

            case 14:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "«-(¯`v´¯)-«");
                    strBld.insert(strBld.length(), "»-(¯`v´¯)-»");
                } else if (!f.getPreviewText().contains("«-(¯`v´¯)-«")) {
                    strBld.insert(0, "«-(¯`v´¯)-«");
                    strBld.insert(strBld.length(), "»-(¯`v´¯)-»");
                }
                break;

            case 15:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "=。:.ﾟ(●ö◡ö●):.｡+ﾟ");
                    strBld.insert(strBld.length(), "=。:.ﾟ(●ö◡ö●):.｡+ﾟ");
                } else if (!f.getPreviewText().contains("=。:.ﾟ(●ö◡ö●):.｡+ﾟ")) {
                    strBld.insert(0, "=。:.ﾟ(●ö◡ö●):.｡+ﾟ");
                    strBld.insert(strBld.length(), "=。:.ﾟ(●ö◡ö●):.｡+ﾟ");
                }
                break;

            case 16:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "❤(｡◕‿◕｡)❤");
                    strBld.insert(strBld.length(), "❤(｡◕‿◕｡)❤");
                } else if (!f.getPreviewText().contains("❤(｡◕‿◕｡)❤")) {
                    strBld.insert(0, "❤(｡◕‿◕｡)❤");
                    strBld.insert(strBld.length(), "❤(｡◕‿◕｡)❤");
                }
                break;

            case 17:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "ლ❣☆(❁‿❁)");
                    strBld.insert(strBld.length(), "(❁‿❁)☆❣ლ");
                } else if (!f.getPreviewText().contains("ლ❣☆(❁‿❁)")) {
                    strBld.insert(0, "ლ❣☆(❁‿❁)");
                    strBld.insert(strBld.length(), "(❁‿❁)☆❣ლ");
                }
                break;

            case 18:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "๑۞๑,¸¸,ø¤º°`°๑۩");
                    strBld.insert(strBld.length(), "๑۩ ,¸¸,ø¤º°`°๑۞๑");
                } else if (!f.getPreviewText().contains("๑۞๑,¸¸,ø¤º°`°๑۩")) {
                    strBld.insert(0, "๑۞๑,¸¸,ø¤º°`°๑۩");
                    strBld.insert(strBld.length(), "๑۩ ,¸¸,ø¤º°`°๑۞๑");
                }
                break;

            case 19:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "*:;,．★ ～☆・:.,;*");
                    strBld.insert(strBld.length(), "*:;,．☆ ～★・:.,;*");
                } else if (!f.getPreviewText().contains("*:;,．★ ～☆・:.,;*")) {
                    strBld.insert(0, "*:;,．★ ～☆・:.,;*");
                    strBld.insert(strBld.length(), "*:;,．☆ ～★・:.,;*");
                }
                break;

            case 20:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "╚»★«╝");
                    strBld.insert(strBld.length(), "╚»★«╝");
                } else if (!f.getPreviewText().contains("╚»★«╝")) {
                    strBld.insert(0, "╚»★«╝");
                    strBld.insert(strBld.length(), "╚»★«╝");
                }
                break;

            case 21:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "➶➶➶➶➶");
                    strBld.insert(strBld.length(), "➷➷➷➷➷");
                } else if (!f.getPreviewText().contains("➶➶➶➶➶")) {
                    strBld.insert(0, "➶➶➶➶➶");
                    strBld.insert(strBld.length(), "➷➷➷➷➷");
                }
                break;

            case 22:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "(｡◕‿‿◕｡)");
                    strBld.insert(strBld.length(), "(｡◕‿‿◕｡)");
                } else if (!f.getPreviewText().contains("(｡◕‿‿◕｡)")) {
                    strBld.insert(0, "(｡◕‿‿◕｡)");
                    strBld.insert(strBld.length(), "(｡◕‿‿◕｡)");
                }
                break;

                case 23:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "`•.¸¸.•´´¯`••._.•");
                    strBld.insert(strBld.length(), "•._.••`¯´´•.¸¸.•`");
                } else if (!f.getPreviewText().contains("`•.¸¸.•´´¯`••._.•")) {
                    strBld.insert(0, "`•.¸¸.•´´¯`••._.•");
                    strBld.insert(strBld.length(), "•._.••`¯´´•.¸¸.•`");
                }
                break;

            case 24:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "☮▁▂▃▄☾ ♛");
                    strBld.insert(strBld.length(), "♛ ☽▄▃▂▁☮");
                } else if (!f.getPreviewText().contains("☮▁▂▃▄☾ ♛")) {
                    strBld.insert(0, "☮▁▂▃▄☾ ♛");
                    strBld.insert(strBld.length(), "♛ ☽▄▃▂▁☮");
                }
                break;

            case 25:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "¸,ø¤º°`°º¤ø,¸¸,ø¤º°");
                    strBld.insert(strBld.length(), "°º¤ø,¸¸,ø¤º°`°º¤ø,¸");
                } else if (!f.getPreviewText().contains("¸,ø¤º°`°º¤ø,¸¸,ø¤º°")) {
                    strBld.insert(0, "¸,ø¤º°`°º¤ø,¸¸,ø¤º°");
                    strBld.insert(strBld.length(), "°º¤ø,¸¸,ø¤º°`°º¤ø,¸");
                }
                break;

            case 26:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "╰☆☆");
                    strBld.insert(strBld.length(), "☆☆╮");
                } else if (!f.getPreviewText().contains("╰☆☆")) {
                    strBld.insert(0, "╰☆☆");
                    strBld.insert(strBld.length(), "☆☆╮");
                }
                break;

            case 27:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "]|I{•------»");
                    strBld.insert(strBld.length(), "«------•}I|[");
                } else if (!f.getPreviewText().contains("]|I{•------»")) {
                    strBld.insert(0, "]|I{•------»");
                    strBld.insert(strBld.length(), "«------•}I|[");
                }
                break;

            case 28:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "(ღ˘⌣˘ღ)");
                    strBld.insert(strBld.length(), "(ღ˘⌣˘ღ)");
                } else if (!f.getPreviewText().contains("(ღ˘⌣˘ღ)")) {
                    strBld.insert(0, "(ღ˘⌣˘ღ)");
                    strBld.insert(strBld.length(), "(ღ˘⌣˘ღ)");
                }
                break;


            case 29:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "(¯`·.¸¸.·´¯`·.¸¸.->");
                    strBld.insert(strBld.length(), "<-.¸¸.·´¯`·.¸¸.·´¯)");
                } else if (!f.getPreviewText().contains("(¯`·.¸¸.·´¯`·.¸¸.->")) {
                    strBld.insert(0, "(¯`·.¸¸.·´¯`·.¸¸.->");
                    strBld.insert(strBld.length(), "<-.¸¸.·´¯`·.¸¸.·´¯)");
                }
                break;

            case 30:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "↤↤❤↤↤");
                    strBld.insert(strBld.length(), "↦↦❤↦↦");
                } else if (!f.getPreviewText().contains("↤↤❤↤↤")) {
                    strBld.insert(0, "↤↤❤↤↤");
                    strBld.insert(strBld.length(), "↦↦❤↦↦");
                }
                break;

            case 31:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "↫↫↫↫↫");
                    strBld.insert(strBld.length(), "↬↬↬↬↬");
                } else if (!f.getPreviewText().contains("↫↫↫↫↫")) {
                    strBld.insert(0, "↫↫↫↫↫");
                    strBld.insert(strBld.length(), "↬↬↬↬↬");
                }
                break;

            case 32:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "【｡_｡】");
                    strBld.insert(strBld.length(), "【｡_｡】");
                } else if (!f.getPreviewText().contains("【｡_｡】")) {
                    strBld.insert(0, "【｡_｡】");
                    strBld.insert(strBld.length(), "【｡_｡】");
                }
                break;

            case 33:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "░▒▓█►─═");
                    strBld.insert(strBld.length(), "═─◄█▓▒░");
                } else if (!f.getPreviewText().contains("░▒▓█►─═")) {
                    strBld.insert(0, "░▒▓█►─═");
                    strBld.insert(strBld.length(), "═─◄█▓▒░");
                }
                break;

            case 34:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "|!¤*'~``~'*¤!|");
                    strBld.insert(strBld.length(), "|!¤*'~``~'*¤!|");
                } else if (!f.getPreviewText().contains("|!¤*'~``~'*¤!|")) {
                    strBld.insert(0, "|!¤*'~``~'*¤!|");
                    strBld.insert(strBld.length(), "|!¤*'~``~'*¤!|");
                }
                break;

            case 35:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "._|.<(+_+)>.|_.");
                    strBld.insert(strBld.length(), "._|.<(+_+)>.|_.");
                } else if (!f.getPreviewText().contains("._|.<(+_+)>.|_.")) {
                    strBld.insert(0, "._|.<(+_+)>.|_.");
                    strBld.insert(strBld.length(), "._|.<(+_+)>.|_.");
                }
                break;

            case 36:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "❤(❁´◡`❁)❤");
                    strBld.insert(strBld.length(), "❤(❁´◡`❁)❤");
                } else if (!f.getPreviewText().contains("❤(❁´◡`❁)❤")) {
                    strBld.insert(0, "❤(❁´◡`❁)❤");
                    strBld.insert(strBld.length(), "❤(❁´◡`❁)❤");
                }
                break;

            case 37:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "-漫~*'¨¯¨'*·舞~");
                    strBld.insert(strBld.length(), "~舞*'¨¯¨'*·~漫-");
                } else if (!f.getPreviewText().contains("-漫~*'¨¯¨'*·舞~")) {
                    strBld.insert(0, "-漫~*'¨¯¨'*·舞~");
                    strBld.insert(strBld.length(), "~舞*'¨¯¨'*·~漫-");
                }
                break;

            case 38:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, ".•°¤*(¯`★´¯)*¤°");
                    strBld.insert(strBld.length(), "°¤*(¯´★`¯)*¤°•.");
                } else if (!f.getPreviewText().contains(".•°¤*(¯`★´¯)*¤°")) {
                    strBld.insert(0, ".•°¤*(¯`★´¯)*¤°");
                    strBld.insert(strBld.length(), "°¤*(¯´★`¯)*¤°•.");
                }
                break;

            case 39:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "⊂◉‿◉つ");
                    strBld.insert(strBld.length(), "⊂◉‿◉つ");
                } else if (!f.getPreviewText().contains("⊂◉‿◉つ")) {
                    strBld.insert(0, "⊂◉‿◉つ");
                    strBld.insert(strBld.length(), "⊂◉‿◉つ");
                }
                break;


            case 40:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "●▬▬▬▬๑۩");
                    strBld.insert(strBld.length(), "۩๑▬▬▬▬▬●");
                } else if (!f.getPreviewText().contains("●▬▬▬▬๑۩")) {
                    strBld.insert(0, "●▬▬▬▬๑۩");
                    strBld.insert(strBld.length(), "۩๑▬▬▬▬▬●");
                }
                break;

            case 41:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "╚═| ~ ಠ ₒ ಠ ~ |═╝");
                    strBld.insert(strBld.length(), "╚═| ~ ಠ ₒ ಠ ~ |═╝");
                } else if (!f.getPreviewText().contains("╚═| ~ ಠ ₒ ಠ ~ |═╝")) {
                    strBld.insert(0, "╚═| ~ ಠ ₒ ಠ ~ |═╝");
                    strBld.insert(strBld.length(), "╚═| ~ ಠ ₒ ಠ ~ |═╝");
                }
                break;

            case 42:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "✿◡‿◡");
                    strBld.insert(strBld.length(), "◡‿◡✿");
                } else if (!f.getPreviewText().contains("✿◡‿◡")) {
                    strBld.insert(0, "✿◡‿◡");
                    strBld.insert(strBld.length(), "◡‿◡✿");
                }
                break;

            case 43:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "<(▰˘◡˘▰)>");
                    strBld.insert(strBld.length(), "<(▰˘◡˘▰)>");
                } else if (!f.getPreviewText().contains("<(▰˘◡˘▰)>")) {
                    strBld.insert(0, "<(▰˘◡˘▰)>");
                    strBld.insert(strBld.length(), "<(▰˘◡˘▰)>");
                }
                break;

            case 44:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "ლ༼ ▀̿ Ĺ̯ ▀̿ ლ༽");
                    strBld.insert(strBld.length(), "ლ༼ ▀̿ Ĺ̯ ▀̿ ლ༽");
                } else if (!f.getPreviewText().contains("ლ༼ ▀̿ Ĺ̯ ▀̿ ლ༽")) {
                    strBld.insert(0, "ლ༼ ▀̿ Ĺ̯ ▀̿ ლ༽");
                    strBld.insert(strBld.length(), "ლ༼ ▀̿ Ĺ̯ ▀̿ ლ༽");
                }
                break;

            case 45:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "乁། ˵ ◕ – ◕ ˵ །ㄏ");
                    strBld.insert(strBld.length(), "乁། ˵ ◕ – ◕ ˵ །ㄏ");
                } else if (!f.getPreviewText().contains("乁། ˵ ◕ – ◕ ˵ །ㄏ")) {
                    strBld.insert(0, "乁། ˵ ◕ – ◕ ˵ །ㄏ");
                    strBld.insert(strBld.length(), "乁། ˵ ◕ – ◕ ˵ །ㄏ");
                }
                break;

            case 46:
                if("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "❤☆(◒‿◒)☆❤");
                    strBld.insert(strBld.length(), "❤☆(◒‿◒)☆❤");
                } else if (!f.getPreviewText().contains("❤☆(◒‿◒)☆❤")) {
                    strBld.insert(0, "❤☆(◒‿◒)☆❤");
                    strBld.insert(strBld.length(), "❤☆(◒‿◒)☆❤");
                }
                break;

            case 47:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "╰། ◉ ◯ ◉ །╯");
                    strBld.insert(strBld.length(), "╰། ◉ ◯ ◉ །╯");
                } else if (!f.getPreviewText().contains("╰། ◉ ◯ ◉ །╯")) {
                    strBld.insert(0, "╰། ◉ ◯ ◉ །╯");
                    strBld.insert(strBld.length(), "╰། ◉ ◯ ◉ །╯");
                }
                break;

            case 48:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "⋋⁞ ◔ ﹏ ◔ ⁞⋌");
                    strBld.insert(strBld.length(), "⋋⁞ ◔ ﹏ ◔ ⁞⋌");
                } else if (!f.getPreviewText().contains("⋋⁞ ◔ ﹏ ◔ ⁞⋌")) {
                    strBld.insert(0, "⋋⁞ ◔ ﹏ ◔ ⁞⋌");
                    strBld.insert(strBld.length(), "⋋⁞ ◔ ﹏ ◔ ⁞⋌");
                }
                break;

            case 49:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "ᕕ༼✪ل͜✪༽ᕗ");
                    strBld.insert(strBld.length(), "ᕗ༼✪ل͜✪༽ᕕ");
                } else if (!f.getPreviewText().contains("ᕕ༼✪ل͜✪༽ᕗ")) {
                    strBld.insert(0, "ᕕ༼✪ل͜✪༽ᕗ");
                    strBld.insert(strBld.length(), "ᕗ༼✪ل͜✪༽ᕕ");
                }
                break;

            case 50:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "(Ɔ ˘⌣˘)♥");
                    strBld.insert(strBld.length(), "♥(˘⌣˘ C)");
                } else if (!f.getPreviewText().contains("(Ɔ ˘⌣˘)♥")) {
                    strBld.insert(0, "(Ɔ ˘⌣˘)♥");
                    strBld.insert(strBld.length(), "♥(˘⌣˘ C)");
                }
                break;


            case 51:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "*•.¸♡");
                    strBld.insert(strBld.length(), "♡¸.•*");
                } else if (!f.getPreviewText().contains("*•.¸♡")) {
                    strBld.insert(0, "*•.¸♡");
                    strBld.insert(strBld.length(), "♡¸.•*");
                }
                break;

            case 52:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "(❁´◡`❁)");
                    strBld.insert(strBld.length(), "(❁´◡`❁)");
                } else if (!f.getPreviewText().contains("(❁´◡`❁)")) {
                    strBld.insert(0, "(❁´◡`❁)");
                    strBld.insert(strBld.length(), "(❁´◡`❁)");
                }
                break;

            case 53:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "☜♡☞");
                    strBld.insert(strBld.length(), "☜♡☞");
                } else if (!f.getPreviewText().contains("☜♡☞")) {
                    strBld.insert(0, "☜♡☞");
                    strBld.insert(strBld.length(), "☜♡☞");
                }
                break;

            case 54:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "-`ღ´--`ღ´-");
                    strBld.insert(strBld.length(), "-`ღ´--`ღ´-");
                } else if (!f.getPreviewText().contains("-`ღ´--`ღ´-")) {
                    strBld.insert(0, "-`ღ´--`ღ´-");
                    strBld.insert(strBld.length(), "-`ღ´--`ღ´-");
                }
                break;

            case 55:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "♡＾▽＾♡");
                    strBld.insert(strBld.length(), "♡＾▽＾♡");
                } else if (!f.getPreviewText().contains("♡＾▽＾♡")) {
                    strBld.insert(0, "♡＾▽＾♡");
                    strBld.insert(strBld.length(), "♡＾▽＾♡");
                }
                break;

            case 56:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "(。♡‿♡。)");
                    strBld.insert(strBld.length(), "(。♡‿♡。)");
                } else if (!f.getPreviewText().contains("(。♡‿♡。)")) {
                    strBld.insert(0, "(。♡‿♡。)");
                    strBld.insert(strBld.length(), "(。♡‿♡。)");
                }
                break;

            case 57:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "♥‿♥");
                    strBld.insert(strBld.length(), "♥‿♥");
                } else if (!f.getPreviewText().contains("♥‿♥")) {
                    strBld.insert(0, "♥‿♥");
                    strBld.insert(strBld.length(), "♥‿♥");
                }
                break;

            case 58:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "♥╣[-_-]╠♥");
                    strBld.insert(strBld.length(), "♥╣[-_-]╠♥");
                } else if (!f.getPreviewText().contains("♥╣[-_-]╠♥")) {
                    strBld.insert(0, "♥╣[-_-]╠♥");
                    strBld.insert(strBld.length(), "♥╣[-_-]╠♥");
                }
                break;

            case 59:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "(✿◠‿◠✿)");
                    strBld.insert(strBld.length(), "(✿◠‿◠✿)");
                } else if (!f.getPreviewText().contains("(✿◠‿◠✿)")) {
                    strBld.insert(0, "(✿◠‿◠✿)");
                    strBld.insert(strBld.length(), "(✿◠‿◠✿)");
                }
                break;

            case 60:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "❣♥(｡◕‿◕｡)♥❣");
                    strBld.insert(strBld.length(), "❣♥(｡◕‿◕｡)♥❣");
                } else if (!f.getPreviewText().contains("❣♥(｡◕‿◕｡)♥❣")) {
                    strBld.insert(0, "❣♥(｡◕‿◕｡)♥❣");
                    strBld.insert(strBld.length(), "❣♥(｡◕‿◕｡)♥❣");
                }
                break;

            case 61:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "ლ❣☆(❁‿❁)☆❣ლ");
                    strBld.insert(strBld.length(), "ლ❣☆(❁‿❁)☆❣ლ");
                } else if (!f.getPreviewText().contains("ლ❣☆(❁‿❁)☆❣ლ")) {
                    strBld.insert(0, "ლ❣☆(❁‿❁)☆❣ლ");
                    strBld.insert(strBld.length(), "ლ❣☆(❁‿❁)☆❣ლ");
                }
                break;

            case 62:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "✿❀❁(◠‿◠)❁❀✿");
                    strBld.insert(strBld.length(), "✿❀❁(◠‿◠)❁❀✿");
                } else if (!f.getPreviewText().contains("✿❀❁(◠‿◠)❁❀✿")) {
                    strBld.insert(0, "✿❀❁(◠‿◠)❁❀✿");
                    strBld.insert(strBld.length(), "✿❀❁(◠‿◠)❁❀✿");
                }
                break;

            case 63:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "✌✌(•ิ‿•ิ)✌✌");
                    strBld.insert(strBld.length(), "✌✌(•ิ‿•ิ)✌✌");
                } else if (!f.getPreviewText().contains("✌✌(•ิ‿•ิ)✌✌")) {
                    strBld.insert(0, "✌✌(•ิ‿•ิ)✌✌");
                    strBld.insert(strBld.length(), "✌✌(•ิ‿•ิ)✌✌");
                }
                break;

            case 64:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "❆❆≧◠‿◠≦❆❆");
                    strBld.insert(strBld.length(), "❆❆≧◠‿◠≦❆❆");
                } else if (!f.getPreviewText().contains("❆❆≧◠‿◠≦❆❆")) {
                    strBld.insert(0, "❆❆≧◠‿◠≦❆❆");
                    strBld.insert(strBld.length(), "❆❆≧◠‿◠≦❆❆");
                }
                break;

            case 65:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "❤❣♥‿♥❣❤");
                    strBld.insert(strBld.length(), "❤❣♥‿♥❣❤");
                } else if (!f.getPreviewText().contains("❤❣♥‿♥❣❤")) {
                    strBld.insert(0, "❤❣♥‿♥❣❤");
                    strBld.insert(strBld.length(), "❤❣♥‿♥❣❤");
                }
                break;

            case 66:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "【★】【★】");
                    strBld.insert(strBld.length(), "【★】【★】");
                } else if (!f.getPreviewText().contains("【★】【★】")) {
                    strBld.insert(0, "【★】【★】");
                    strBld.insert(strBld.length(), "【★】【★】");
                }
                break;

            case 67:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "☜☆☞");
                    strBld.insert(strBld.length(), "☜☆☞");
                } else if (!f.getPreviewText().contains("☜☆☞")) {
                    strBld.insert(0, "☜☆☞");
                    strBld.insert(strBld.length(), "☜☆☞");
                }
                break;

            case 68:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "●♡▬▬♡");
                    strBld.insert(strBld.length(), "♡▬▬♡●");
                } else if (!f.getPreviewText().contains("●♡▬▬♡")) {
                    strBld.insert(0, "●♡▬▬♡");
                    strBld.insert(strBld.length(), "♡▬▬♡●");
                }
                break;

            case 69:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "❣❤---» [");
                    strBld.insert(strBld.length(), "] «---❤❣");
                } else if (!f.getPreviewText().contains("❣❤---» [")) {
                    strBld.insert(0, "❣❤---» [");
                    strBld.insert(strBld.length(), "] «---❤❣");
                }
                break;

            case 70:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "(▰˘◡˘▰)");
                    strBld.insert(strBld.length(), "(▰˘◡˘▰)");
                } else if (!f.getPreviewText().contains("(▰˘◡˘▰)")) {
                    strBld.insert(0, "(▰˘◡˘▰)");
                    strBld.insert(strBld.length(), "(▰˘◡˘▰)");
                }
                break;
            case 71:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "☀(ღ˘⌣˘ღ)☀");
                    strBld.insert(strBld.length(), "☀(ღ˘⌣˘ღ)☀");
                } else if (!f.getPreviewText().contains("☀(ღ˘⌣˘ღ)☀")) {
                    strBld.insert(0, "☀(ღ˘⌣˘ღ)☀");
                    strBld.insert(strBld.length(), "☀(ღ˘⌣˘ღ)☀");
                }
                break;
            case 72:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "☀❤◕ ‿ ◕❤☀");
                    strBld.insert(strBld.length(), "☀❤◕ ‿ ◕❤☀");
                } else if (!f.getPreviewText().contains("☀❤◕ ‿ ◕❤☀")) {
                    strBld.insert(0, "☀❤◕ ‿ ◕❤☀");
                    strBld.insert(strBld.length(), "☀❤◕ ‿ ◕❤☀");
                }
                break;
            case 73:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "❤╰། ◉ ◯ ◉ །╯❤");
                    strBld.insert(strBld.length(), "❤╰། ◉ ◯ ◉ །╯❤");
                } else if (!f.getPreviewText().contains("❤╰། ◉ ◯ ◉ །╯❤")) {
                    strBld.insert(0, "❤╰། ◉ ◯ ◉ །╯❤");
                    strBld.insert(strBld.length(), "❤╰། ◉ ◯ ◉ །╯❤");
                }
                break;
            case 74:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "❄♥‿♥❄");
                    strBld.insert(strBld.length(), "❄♥‿♥❄");
                } else if (!f.getPreviewText().contains("❄♥‿♥❄")) {
                    strBld.insert(0, "❄♥‿♥❄");
                    strBld.insert(strBld.length(), "❄♥‿♥❄");
                }
                break;
            case 75:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "☀☀｡◕‿‿◕｡☀☀");
                    strBld.insert(strBld.length(), "☀☀｡◕‿‿◕｡☀☀");
                } else if (!f.getPreviewText().contains("☀☀｡◕‿‿◕｡☀☀")) {
                    strBld.insert(0, "☀☀｡◕‿‿◕｡☀☀");
                    strBld.insert(strBld.length(), "☀☀｡◕‿‿◕｡☀☀");
                }
                break;
            case 76:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "↫❣(◕ω◕)❣↬");
                    strBld.insert(strBld.length(), "↫❣(◕ω◕)❣↬");
                } else if (!f.getPreviewText().contains("↫❣(◕ω◕)❣↬")) {
                    strBld.insert(0, "↫❣(◕ω◕)❣↬");
                    strBld.insert(strBld.length(), "↫❣(◕ω◕)❣↬");
                }
                break;
            case 77:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "☜☆☞(◠‿◠)");
                    strBld.insert(strBld.length(), "(◠‿◠)☜☆☞");
                } else if (!f.getPreviewText().contains("☜☆☞(◠‿◠)")) {
                    strBld.insert(0, "☜☆☞(◠‿◠)");
                    strBld.insert(strBld.length(), "(◠‿◠)☜☆☞");
                }
                break;
            case 78:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "☀웃❤유☀");
                    strBld.insert(strBld.length(), "☀웃❤유☀");
                } else if (!f.getPreviewText().contains("☀웃❤유☀")) {
                    strBld.insert(0, "☀웃❤유☀");
                    strBld.insert(strBld.length(), "☀웃❤유☀");
                }
                break;

            case 79:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "❤ᶫᵒᵛᵉᵧₒᵤ❤");
                    strBld.insert(strBld.length(), "❤ᶫᵒᵛᵉᵧₒᵤ❤");
                } else if (!f.getPreviewText().contains("❤ᶫᵒᵛᵉᵧₒᵤ❤")) {
                    strBld.insert(0, "❤ᶫᵒᵛᵉᵧₒᵤ❤");
                    strBld.insert(strBld.length(), "❤ᶫᵒᵛᵉᵧₒᵤ❤");
                }
                break;

            case 80:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "❤ℐɕℎ ℒ℩ℯɓℯ ɗ℩ɕℎ❤");
                    strBld.insert(strBld.length(), "❤ℐɕℎ ℒ℩ℯɓℯ ɗ℩ɕℎ❤");
                } else if (!f.getPreviewText().contains("❤ℐɕℎ ℒ℩ℯɓℯ ɗ℩ɕℎ❤")) {
                    strBld.insert(0, "❤ℐɕℎ ℒ℩ℯɓℯ ɗ℩ɕℎ❤");
                    strBld.insert(strBld.length(), "❤ℐɕℎ ℒ℩ℯɓℯ ɗ℩ɕℎ❤");
                }
                break;

            case 81:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "➳♥➳♥➳");
                    strBld.insert(strBld.length(), "➳♥➳♥➳");
                } else if (!f.getPreviewText().contains("➳♥➳♥➳")) {
                    strBld.insert(0, "➳♥➳♥➳");
                    strBld.insert(strBld.length(), "➳♥➳♥➳");
                }
                break;


            case 82:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "✿◡‿◡✿");
                    strBld.insert(strBld.length(), "✿◡‿◡✿");
                } else if (!f.getPreviewText().contains("✿◡‿◡✿")) {
                    strBld.insert(0, "✿◡‿◡✿");
                    strBld.insert(strBld.length(), "✿◡‿◡✿");
                }
                break;

            case 83:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "●▬ൠൠ▬");
                    strBld.insert(strBld.length(), "▬ൠൠ▬●");
                } else if (!f.getPreviewText().contains("●▬ൠൠ▬")) {
                    strBld.insert(0, "●▬ൠൠ▬");
                    strBld.insert(strBld.length(), "▬ൠൠ▬●");
                }
                break;

            case 84:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "[̲̅ə̲̅٨̲̅٥̲̅٦̲̅]");
                    strBld.insert(strBld.length(), "[̲̅ə̲̅٨̲̅٥̲̅٦̲̅]");
                } else if (!f.getPreviewText().contains("[̲̅ə̲̅٨̲̅٥̲̅٦̲̅]")) {
                    strBld.insert(0, "[̲̅ə̲̅٨̲̅٥̲̅٦̲̅]");
                    strBld.insert(strBld.length(), "[̲̅ə̲̅٨̲̅٥̲̅٦̲̅]");
                }
                break;

            case 85:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "✰(❤˘⌣˘❤)✰");
                    strBld.insert(strBld.length(), "✰(❤˘⌣˘❤)✰");
                } else if (!f.getPreviewText().contains("✰(❤˘⌣˘❤)✰")) {
                    strBld.insert(0, "✰(❤˘⌣˘❤)✰");
                    strBld.insert(strBld.length(), "✰(❤˘⌣˘❤)✰");
                }
                break;

            case 86:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "❤◉◡◉❤");
                    strBld.insert(strBld.length(), "❤◉◡◉❤");
                } else if (!f.getPreviewText().contains("❤◉◡◉❤")) {
                    strBld.insert(0, "❤◉◡◉❤");
                    strBld.insert(strBld.length(), "❤◉◡◉❤");
                }
                break;

            case 87:
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "✬✬（⌒▽⌒）✬✬");
                    strBld.insert(strBld.length(), "✬✬（⌒▽⌒）✬✬");
                } else if (!f.getPreviewText().contains("✬✬（⌒▽⌒）✬✬")) {
                    strBld.insert(0, "✬✬（⌒▽⌒）✬✬");
                    strBld.insert(strBld.length(), "✬✬（⌒▽⌒）✬✬");
                }
                break;

            case 88 :
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "❣⍣◕‿◕⍣❣");
                    strBld.insert(strBld.length(), "❣⍣◕‿◕⍣❣");
                } else if (!f.getPreviewText().contains("❣⍣◕‿◕⍣❣")) {
                    strBld.insert(0, "❣⍣◕‿◕⍣❣");
                    strBld.insert(strBld.length(), "❣⍣◕‿◕⍣❣");
                }
                break;

            case 89 :
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "☀☀♡♡");
                    strBld.insert(strBld.length(), "♡♡☀☀");
                } else if (!f.getPreviewText().contains("☀☀♡♡")) {
                    strBld.insert(0, "☀☀♡♡");
                    strBld.insert(strBld.length(), "♡♡☀☀");
                }
                break;


            case 90 :
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "ღღ(∩_∩)ღღ");
                    strBld.insert(strBld.length(), "ღღ(∩_∩)ღღ");
                } else if (!f.getPreviewText().contains("ღღ(∩_∩)ღღ")) {
                    strBld.insert(0, "ღღ(∩_∩)ღღ");
                    strBld.insert(strBld.length(), "ღღ(∩_∩)ღღ");
                }
                break;

            case 91 :
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "☃（*^_^*）☃");
                    strBld.insert(strBld.length(), "☃（*^_^*）☃");
                } else if (!f.getPreviewText().contains("☃（*^_^*）☃")) {
                    strBld.insert(0, "☃（*^_^*）☃");
                    strBld.insert(strBld.length(), "☃（*^_^*）☃");
                }
                break;

            case 92 :
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "✮{◕ ◡ ◕}✮");
                    strBld.insert(strBld.length(), "✮{◕ ◡ ◕}✮");
                } else if (!f.getPreviewText().contains("✮{◕ ◡ ◕}✮")) {
                    strBld.insert(0, "✮{◕ ◡ ◕}✮");
                    strBld.insert(strBld.length(), "✮{◕ ◡ ◕}✮");
                }
                break;

            case 93 :
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "⁑☾˙❀‿❀˙☽⁑");
                    strBld.insert(strBld.length(), "⁑☾˙❀‿❀˙☽⁑");
                } else if (!f.getPreviewText().contains("⁑☾˙❀‿❀˙☽⁑")) {
                    strBld.insert(0, "⁑☾˙❀‿❀˙☽⁑");
                    strBld.insert(strBld.length(), "⁑☾˙❀‿❀˙☽⁑");
                }
                break;

            case 94 :
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "♥♡◙‿◙♡♥");
                    strBld.insert(strBld.length(), "♥♡◙‿◙♡♥");
                } else if (!f.getPreviewText().contains("♥♡◙‿◙♡♥")) {
                    strBld.insert(0, "♥♡◙‿◙♡♥");
                    strBld.insert(strBld.length(), "♥♡◙‿◙♡♥");
                }
                break;

            case 95 :
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "❄｡◕ ‿ ◕｡❄");
                    strBld.insert(strBld.length(), "❄｡◕ ‿ ◕｡❄");
                } else if (!f.getPreviewText().contains("❄｡◕ ‿ ◕｡❄")) {
                    strBld.insert(0, "❄｡◕ ‿ ◕｡❄");
                    strBld.insert(strBld.length(), "❄｡◕ ‿ ◕｡❄");
                }
                break;

            case 96 :
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "❣ლʘ‿ʘლ❣");
                    strBld.insert(strBld.length(), "❣ლʘ‿ʘლ❣");
                } else if (!f.getPreviewText().contains("❣ლʘ‿ʘლ❣")) {
                    strBld.insert(0, "❣ლʘ‿ʘლ❣");
                    strBld.insert(strBld.length(), "❣ლʘ‿ʘლ❣");
                }
                break;

            case 97 :
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "❤(●'◡'●)❤");
                    strBld.insert(strBld.length(), "❤(●'◡'●)❤");
                } else if (!f.getPreviewText().contains("❤(●'◡'●)❤")) {
                    strBld.insert(0, "❤(●'◡'●)❤");
                    strBld.insert(strBld.length(), "❤(●'◡'●)❤");
                }
                break;

            case 98 :
                if ("Preview text".equals(f.getPreviewText())) {
                    strBld.insert(0, "♪┏(°.°)┛");
                    strBld.insert(strBld.length(), "♪┏(°.°)┛");
                } else if (!f.getPreviewText().contains("♪┏(°.°)┛")) {
                    strBld.insert(0, "♪┏(°.°)┛");
                    strBld.insert(strBld.length(), "♪┏(°.°)┛");
                }
                break;





        }

        f.setPreviewText(strBld.toString());
        holder.description.setText(f.getPreviewText());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ClipboardManager clipboard = (ClipboardManager) activity.getSystemService(CLIPBOARD_SERVICE);
                String desStr = holder.description.getText().toString();
                Toast.makeText(activity, "Copied to clipboard! Your copied text is " + desStr, Toast.LENGTH_SHORT).show();
                ClipData clip = ClipData.newPlainText("simple text", desStr);
                if (clipboard != null) {
                    clipboard.setPrimaryClip(clip);
                }


            }
        });
    }


    @Override
    public int getItemCount() {
        return decorationFonts.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView description;
        CardView cardView;

        private MyViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title_text_view_DF);
            description = itemView.findViewById(R.id.description_text_view_DF);
            cardView = itemView.findViewById(R.id.card_view_DF);
        }
    }
}




package com.example.android.loonatheapp;

import android.graphics.Color;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MembersData {
    private static String[] membersName = {
        "HEEJIN", "HYUNJIN", "HASEUL",
        "YEOJIN", "VIVI", "KIM LIP",
        "JINSOUL", "CHOERRY", "YVES",
        "CHUU", "GOWON", "OLIVIA HYE"
    };

    private static String[] hangulName = {
        "희진", "현진", "하슬", "여진",
        "비비", "김립", "진솔", "최리",
        "이브", "츄", "고원", "올리비아 혜"
    };

    private static  int[] membersImages = {
        R.drawable.heejin,
        R.drawable.hyunjin,
        R.drawable.haseul,
        R.drawable.yeojin,
        R.drawable.vivi,
        R.drawable.kim_lip,
        R.drawable.jinsoul,
        R.drawable.choerry,
        R.drawable.yves,
        R.drawable.chuu,
        R.drawable.gowon,
        R.drawable.olivia_hye
    };

    private static int[] colors = {
        Color.parseColor("#ED008E"),
        Color.parseColor("#FFCA14"),
        Color.parseColor("#03A233"),
        Color.parseColor("#FE9702"),
        Color.parseColor("#FFC5C8"),
        Color.parseColor("#D90011"),
        Color.parseColor("#0801D5"),
        Color.parseColor("#BA01DE"),
        Color.parseColor("#790105"),
        Color.parseColor("#FEA87D"),
        Color.parseColor("#02BCA1"),
        Color.parseColor("#C0C0C0"),
    };

    private static String[] date = {
        "October 19, 2000", "November 15, 2000", "August 18, 1997", "November 11, 2002",
        "December 9, 1996", "February 10, 1999", " June 13, 1997", "June 4, 2001",
        "May 24th, 1997", "October 20, 1999", "November 19th, 2000", "November 13, 2001"
    };

    static ArrayList<Member> getListData(){
        ArrayList<Member> list = new ArrayList<>();

        for (int position = 0; position < membersName.length; position++){
            Member member = new Member();
            member.setName(membersName[position]);
            member.setHangul(hangulName[position]);
            member.setPhoto(membersImages[position]);
            member.setColor(colors[position]);
            member.setDate(date[position]);
            list.add(member);
        }

        return list;
    }
}

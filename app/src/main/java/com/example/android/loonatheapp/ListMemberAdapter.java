package com.example.android.loonatheapp;

import android.content.Intent;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListMemberAdapter extends RecyclerView.Adapter<ListMemberAdapter.ListViewHolder> {
    private ArrayList<Member> listMember;

    public ListMemberAdapter(ArrayList<Member> listMember) {
        this.listMember = listMember;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_member, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        Member member = listMember.get(position);
        Glide.with(holder.itemView.getContext())
                .load(member.getPhoto())
                .apply(new RequestOptions().override(75, 75))
                .into(holder.imgPhoto);
        holder.tvName.setText(member.getName());
        holder.tvHangul.setText(member.getHangul());
        holder.tvDate.setText(member.getDate());
        holder.layout_color.setBackgroundColor(member.getColor());
        holder.layout_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                switch (position){
                    case 0 :
                        intent = new Intent(holder.layout_color.getContext(), Heejin.class);
                        break;
                    case 1 :
                        intent = new Intent(holder.layout_color.getContext(), Hyunjin.class);
                        break;
                    case 2 :
                        intent = new Intent(holder.layout_color.getContext(), Haseul.class);
                        break;
                    case 3 :
                        intent = new Intent(holder.layout_color.getContext(), Yeojin.class);
                        break;
                    case 4 :
                        intent = new Intent(holder.layout_color.getContext(), Vivi.class);
                        break;
                    case 5 :
                        intent = new Intent(holder.layout_color.getContext(), KimLip.class);
                        break;
                    case 6 :
                        intent = new Intent(holder.layout_color.getContext(), Jinsoul.class);
                        break;
                    case 7 :
                        intent = new Intent(holder.layout_color.getContext(), Choerry.class);
                        break;
                    case 8 :
                        intent = new Intent(holder.layout_color.getContext(), Yves.class);
                        break;
                    case 9 :
                        intent = new Intent(holder.layout_color.getContext(), Chuu.class);
                        break;
                    case 10 :
                        intent = new Intent(holder.layout_color.getContext(), Gowon.class);
                        break;
                    case 11 :
                        intent = new Intent(holder.layout_color.getContext(), OliviaHye.class);
                        break;
                }
                holder.layout_color.getContext().startActivity(intent);
            }
        });
     }

    @Override
    public int getItemCount() {
        return listMember.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvHangul, tvDate;
        RelativeLayout layout_color;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvHangul = itemView.findViewById(R.id.tv_item_hangul);
            tvDate = itemView.findViewById(R.id.tv_item_date);
            layout_color = itemView.findViewById(R.id.container);
        }
    }
}

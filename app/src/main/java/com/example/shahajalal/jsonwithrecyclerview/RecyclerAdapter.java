package com.example.shahajalal.jsonwithrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.myviewhoder>{
    private List<Contact> list=new ArrayList<>();

    RecyclerAdapter(List<Contact> list){
        this.list=list;

    }

    @NonNull
    @Override
    public myviewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return new myviewhoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewhoder holder, int position) {

        holder.operator.setText(list.get(position).getOperator());
        holder.prefix.setText(list.get(position).getPrefix());
        holder.rate.setText(list.get(position).getRate());
        holder.comm.setText(list.get(position).getComm());
        holder.charge.setText(list.get(position).getCharge());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class myviewhoder extends RecyclerView.ViewHolder{

        TextView operator,prefix;
        EditText rate,comm,charge;
        CheckBox checkBox;
        public myviewhoder(View itemView) {
            super(itemView);
            operator=itemView.findViewById(R.id.operatortextviewid);
            prefix=itemView.findViewById(R.id.prefixtextviewid);
            rate=itemView.findViewById(R.id.rateedittextid);
            comm=itemView.findViewById(R.id.commedittextview);
            charge=itemView.findViewById(R.id.chargeedittextview);
            checkBox=itemView.findViewById(R.id.checkboxviewid);
        }
    }
}

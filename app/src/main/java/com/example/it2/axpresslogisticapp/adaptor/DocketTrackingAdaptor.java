package com.example.it2.axpresslogisticapp.adaptor;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.it2.axpresslogisticapp.R;
import com.example.it2.axpresslogisticapp.model.DocketTracking;

import java.util.List;

public class DocketTrackingAdaptor extends RecyclerView.Adapter<DocketTrackingAdaptor.ViewHolder> {
    private Context context;
    private List<DocketTracking> list;

    public DocketTrackingAdaptor(Context context, List<DocketTracking> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.challan_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DocketTracking docketTracking = list.get(position);

        holder.txtChallan_no.setText(docketTracking.getChallan_no());
        holder.txtChallan_date.setText(docketTracking.getChallan_date());
        holder.txtChallan_from.setText(docketTracking.getChallan_from());
        holder.txtChallan_to.setText(docketTracking.getChallan_to());
        holder.txtVehicle_no.setText(docketTracking.getVehicle_no());
        holder.txtChallan_status.setText(docketTracking.getChallan_status());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtChallan_no,txtChallan_date,txtChallan_from, txtChallan_to, txtChallan_status, txtVehicle_no;

        public ViewHolder(View itemView) {
            super(itemView);

            txtChallan_no = itemView.findViewById(R.id.txt_challen_no_ID);
            txtChallan_date = itemView.findViewById(R.id.txt_challen_dateID);
            txtChallan_from = itemView.findViewById(R.id.txt_challan_date_fromID);
            txtChallan_to = itemView.findViewById(R.id.txt_challan_date_toID);
            txtVehicle_no = itemView.findViewById(R.id.txt_vehical_noID);
            txtChallan_status = itemView.findViewById(R.id.txt_vehical_statusID);
        }
    }
}
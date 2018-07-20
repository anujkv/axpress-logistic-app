package com.example.it2.axpresslogisticapp.adaptor;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.it2.axpresslogisticapp.R;
import com.example.it2.axpresslogisticapp.acitvities.CustomerVisitFormActivity;
import com.example.it2.axpresslogisticapp.model.AppliedLeaveModel;

import java.util.List;

public class AppliedLeaveAdaptor extends RecyclerView.Adapter<AppliedLeaveAdaptor.AppliedLeaveHolder> {

    Context context;
    List<AppliedLeaveModel> appliedLeaveModelList;

    public AppliedLeaveAdaptor(Context context, List<AppliedLeaveModel> appliedLeaveModelList) {
        this.context = context;
        this.appliedLeaveModelList = appliedLeaveModelList;
    }

    @NonNull
    @Override
    public AppliedLeaveHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.applied_leave_listview, parent, false);
        return new AppliedLeaveHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AppliedLeaveHolder holder, int position) {
        AppliedLeaveModel appliedLeaveModel = new AppliedLeaveModel();
        holder.from.setText(appliedLeaveModel.getFrom());
        holder.reason.setText(appliedLeaveModel.getReason());
        holder.day.setText(appliedLeaveModel.getDays());
        holder.type.setText(appliedLeaveModel.getType());
        holder.to.setText(appliedLeaveModel.getTo());
        holder.pin_no.setText(appliedLeaveModel.getPin_no());
        holder.applied_date.setText(appliedLeaveModel.getApplied_date());
        holder.leave_status.setText(appliedLeaveModel.getLeave_status());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Leave", Toast.LENGTH_SHORT).show();
//                Context context = v.getContext();
//                Intent intent = new Intent(context, LeavePopFragment.class);
////                intent.putExtra("followChecked",true);
//                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return appliedLeaveModelList.size();
    }

    public class AppliedLeaveHolder extends RecyclerView.ViewHolder {
        TextView from, to, reason, type, pin_no, day, applied_date,leave_status;
        CardView cardView;

        public AppliedLeaveHolder(View itemView) {
            super(itemView);
            from = itemView.findViewById(R.id.txtfromdate);
            to = itemView.findViewById(R.id.txttodate);
            reason = itemView.findViewById(R.id.txtreason);
            day = itemView.findViewById(R.id.days);
            type = itemView.findViewById(R.id.txttype);
            pin_no = itemView.findViewById(R.id.txtpin_no);
            applied_date = itemView.findViewById(R.id.txtappliedDate);
            leave_status = itemView.findViewById(R.id.txtleave_status);
            cardView = itemView.findViewById(R.id.leaveAppliedCardView);
        }
    }
}

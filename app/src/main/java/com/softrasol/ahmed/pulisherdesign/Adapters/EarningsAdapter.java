package com.softrasol.ahmed.pulisherdesign.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.softrasol.ahmed.pulisherdesign.Models.EarningsModel;
import com.softrasol.ahmed.pulisherdesign.R;

import java.util.List;

public class EarningsAdapter extends RecyclerView.Adapter<EarningsAdapter.ViewHolder> {

    private Context context;
    private List<EarningsModel> list;

    public EarningsAdapter(Context context, List<EarningsModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.earnings_items_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        EarningsModel model = list.get(position);

        holder.mTxtDetails.setText(
                position+1+".\n"+
                        "Day: "+model.getDay()+"\n"+
                "Time: "+model.getTime()+"\n"+
                        "Publication Title: "+model.getPublicationTitle()+"\n"+
                        "Authors/Edition No/Issue No: "+model.getAuthorEdition()+"\n"+
                        "Subscriptions Type: "+model.getSubscriptionType()+"\n"+
                        "Amt Paid: "+model.getAmtPaid()+"\n"+
                        "Publisher Share: "+model.getPublisherShare()+"\n"+
                        "News Bag Share: "+model.getNewsBagShare()+"\n"+
                        "Earnings Total: "+model.getEarningsTotal()+"\n"+
                        "Payout Total: "+model.getPayoutTotal()+""

        );
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView mTxtDetails;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTxtDetails = itemView.findViewById(R.id.txt_earnings);
        }
    }
}

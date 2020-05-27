package com.softrasol.ahmed.pulisherdesign.Models;

public class EarningsModel {

    private String day, time, publicationTitle, authorEdition,
    subscriptionType, amtPaid, publisherShare, newsBagShare, earningsTotal,
    payoutTotal;

    public EarningsModel() {
    }

    public EarningsModel(String day, String time, String publicationTitle, String authorEdition,
                         String subscriptionType, String amtPaid, String publisherShare,
                         String newsBagShare, String earningsTotal, String payoutTotal) {
        this.day = day;
        this.time = time;
        this.publicationTitle = publicationTitle;
        this.authorEdition = authorEdition;
        this.subscriptionType = subscriptionType;
        this.amtPaid = amtPaid;
        this.publisherShare = publisherShare;
        this.newsBagShare = newsBagShare;
        this.earningsTotal = earningsTotal;
        this.payoutTotal = payoutTotal;
    }


    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPublicationTitle() {
        return publicationTitle;
    }

    public void setPublicationTitle(String publicationTitle) {
        this.publicationTitle = publicationTitle;
    }

    public String getAuthorEdition() {
        return authorEdition;
    }

    public void setAuthorEdition(String authorEdition) {
        this.authorEdition = authorEdition;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public String getAmtPaid() {
        return amtPaid;
    }

    public void setAmtPaid(String amtPaid) {
        this.amtPaid = amtPaid;
    }

    public String getPublisherShare() {
        return publisherShare;
    }

    public void setPublisherShare(String publisherShare) {
        this.publisherShare = publisherShare;
    }

    public String getNewsBagShare() {
        return newsBagShare;
    }

    public void setNewsBagShare(String newsBagShare) {
        this.newsBagShare = newsBagShare;
    }

    public String getEarningsTotal() {
        return earningsTotal;
    }

    public void setEarningsTotal(String earningsTotal) {
        this.earningsTotal = earningsTotal;
    }

    public String getPayoutTotal() {
        return payoutTotal;
    }

    public void setPayoutTotal(String payoutTotal) {
        this.payoutTotal = payoutTotal;
    }
}

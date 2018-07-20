package com.ally.spenditright;


import android.os.Parcel;
import android.os.Parcelable;

public class Transaction implements Parcelable{

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    private Transaction(Parcel in) {
        this.transactionID = in.readString();
        this.transactionName = in.readString();
        this.senderAccID = in.readString();
        this.senderAccName = in.readString();
        this.recipientAccID = in.readString();
        this.recipientAccName = in.readString();
        this.transactionAmount = in.readDouble();
    }

    public static final Parcelable.Creator<Transaction> CREATOR
            = new Parcelable.Creator<Transaction>() {

        // This simply calls our new constructor (typically private) and
        // passes along the unmarshalled `Parcel`, and then returns the new object!
        @Override
        public Transaction createFromParcel(Parcel in) {
            return new Transaction(in);
        }

        // We just need to copy this and change the type to match our class.
        @Override
        public Transaction[] newArray(int size) {
            return new Transaction[size];
        }
    };

    String transactionID;
    String transactionName;
    String senderAccID;
    String senderAccName;
    String recipientAccID;
    String recipientAccName;
    Double transactionAmount;

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public String getSenderAccID() {
        return senderAccID;
    }

    public void setSenderAccID(String senderAccID) {
        this.senderAccID = senderAccID;
    }

    public String getSenderAccName() {
        return senderAccName;
    }

    public void setSenderAccName(String senderAccName) {
        this.senderAccName = senderAccName;
    }

    public String getRecipientAccID() {
        return recipientAccID;
    }

    public void setRecipientAccID(String recipientAccID) {
        this.recipientAccID = recipientAccID;
    }

    public String getRecipientAccName() {
        return recipientAccName;
    }

    public void setRecipientAccName(String recipientAccName) {
        this.recipientAccName = recipientAccName;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Transaction(String transactionID, String transactionName, String senderAccID, String senderAccName, String recipientAccID, String recipientAccName, Double transactionAmount) {

        this.transactionID = transactionID;
        this.transactionName = transactionName;
        this.senderAccID = senderAccID;
        this.senderAccName = senderAccName;
        this.recipientAccID = recipientAccID;
        this.recipientAccName = recipientAccName;
        this.transactionAmount = transactionAmount;
    }

    public Transaction(){

    }
}

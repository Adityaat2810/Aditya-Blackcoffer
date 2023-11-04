package com.example.netcaln_aditya.dataClass

import android.os.Parcel
import android.os.Parcelable

data class userData(var username:String?, var userImage:Int,
                    var userLoaction:String?,
                    var userDescription:String?,
                    var userTagLines:String?) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),

    )

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<userData> {
        override fun createFromParcel(parcel: Parcel): userData {
            return userData(parcel)
        }

        override fun newArray(size: Int): Array<userData?> {
            return arrayOfNulls(size)
        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(username)
        parcel.writeInt(userImage)
        parcel.writeString(userLoaction)
        parcel.writeString(userDescription)
        parcel.writeString(userTagLines)

    }





}
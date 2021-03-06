package com.override0330.android.redrock.mredrockexam2019.contract

import android.content.Context
import android.view.View
import com.override0330.android.redrock.mredrockexam2019.bean.music.MyMusic

class DetailMusicContract{
    interface DetailView{
        fun showDetailMusic(name:String,author:String,imageUrl:String)
        fun showLyric(viewList:ArrayList<View>)
        fun showToast(message:String)
        fun changeLyricPosition(position:Int)
        fun changeNowTimeTextView(time:String)
        fun changeSeekBarPosition(position:Int)
    }

    interface DetailModel {
        fun getNowMusic(callBack: GetNowMusicCallBack)
        fun getLyric(context:Context,callBack: GetLyricCallBack)
    }
    interface GetNowMusicCallBack{
        fun onSuccess(music: MyMusic)
        fun onFail(info:String)
    }
    interface GetLyricCallBack{
        fun onSuccess(viewList: ArrayList<View>)
        fun onFail(info:String)
    }
}
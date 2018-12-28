package com.goodjob.musicplayer.entity;

import android.os.Bundle;
import android.provider.MediaStore;

import com.goodjob.musicplayer.util.MediaUtils;

import java.io.Serializable;
public class Audio implements Serializable {
    private String mTitle;
    private String mTitleKey;
    private String mArtist;
    private String mArtistKey;
    private String mAlbum;
    private String mAlbumKey;
    private String mComposer;
    private String mPath;
    private String mDisplayName;
    private String mMimeType;
    private int mId;
    private int mSize;
    private int mDateAdd;
    private int mDuration;
    private int mArtistId;
    private int mAlbumId;
    private int mTrack;
    private int mYear;
    private boolean mIsDrm;
    private boolean mIsRingtone;
    private boolean mIsMusic;
    private boolean mIsAlarm;
    private boolean mIsNotification;
    private boolean mIsPodcast;


    //使用bundle在Activity中传输数据
    public Audio(Bundle bundle) {
        mTitle = bundle.getString(MediaStore.Audio.AudioColumns.TITLE);                 //歌名
        mTitleKey = bundle.getString(MediaStore.Audio.AudioColumns.TITLE_KEY);
        mArtist = bundle.getString(MediaStore.Audio.AudioColumns.ARTIST);               //歌手
        mArtistKey = bundle.getString(MediaStore.Audio.AudioColumns.ARTIST_KEY);
        mAlbum = bundle.getString(MediaStore.Audio.AudioColumns.ALBUM);                 //专辑
        mAlbumKey = bundle.getString(MediaStore.Audio.AudioColumns.ALBUM_KEY);
//
        mComposer = bundle.getString(MediaStore.Audio.AudioColumns.COMPOSER);           //作曲家
        mPath = bundle.getString(MediaStore.Audio.AudioColumns.DATA);                   //路径
        mDisplayName = bundle.getString(MediaStore.Audio.AudioColumns.DISPLAY_NAME);    //显示名称
        mMimeType = bundle.getString(MediaStore.Audio.AudioColumns.MIME_TYPE);
        mId = bundle.getInt(MediaStore.Audio.AudioColumns._ID);
        mSize = bundle.getInt(MediaStore.Audio.AudioColumns.SIZE);
        mDateAdd = bundle.getInt(MediaStore.Audio.AudioColumns.DATE_ADDED);
        mDuration = bundle.getInt(MediaStore.Audio.AudioColumns.DURATION);
        mArtistId = bundle.getInt(MediaStore.Audio.AudioColumns.ARTIST_ID);
        mAlbumId = bundle.getInt(MediaStore.Audio.AudioColumns.ALBUM_ID);
        mTrack = bundle.getInt(MediaStore.Audio.AudioColumns.TRACK);
        mYear = bundle.getInt(MediaStore.Audio.AudioColumns.YEAR);

        //列表可显示音乐
        mIsDrm = bundle.getInt(MediaStore.Audio.AudioColumns.IS_ALARM) == 1;
        mIsRingtone = bundle.getInt(MediaStore.Audio.AudioColumns.IS_RINGTONE) == 1;
        mIsMusic = bundle.getInt(MediaStore.Audio.AudioColumns.IS_MUSIC) == 1;
        mIsAlarm = bundle.getInt(MediaStore.Audio.AudioColumns.IS_ALARM) == 1;
        mIsNotification = bundle.getInt(MediaStore.Audio.AudioColumns.IS_NOTIFICATION) == 1;
        mIsPodcast = bundle.getInt(MediaStore.Audio.AudioColumns.IS_PODCAST) == 1;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getTitleKey() {
        return mTitleKey;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getArtistKey() {
        return mArtistKey;
    }

    public String getAlbum() {
        return mAlbum;
    }

    public String getAlbumKey() {
        return mAlbumKey;
    }

    public String getComposer() {
        return mComposer;
    }

    public String getPath() {
        return mPath;
    }

    public String getDisplayName() {
        return mDisplayName;
    }

    public String getMimeType() {
        return mMimeType;
    }

    public int getId() {
        return mId;
    }

    public int getSize() {
        return mSize;
    }

    public int getDateAdd() {
        return mDateAdd;
    }

    public int getDuration() {
        return mDuration;
    }

    public int getArtistId() {
        return mArtistId;
    }

    public int getAlbumId() {
        return mAlbumId;
    }

    public int getTrack() {
        return mTrack;
    }

    public int getYear() {
        return mYear;
    }

    public boolean isDrm() {
        return mIsDrm;
    }

    public boolean isRingtone() {
        return mIsRingtone;
    }

    public boolean isMusic() {
        return mIsMusic;
    }

    public boolean isAlarm() {
        return mIsAlarm;
    }

    public boolean isNotification() {
        return mIsNotification;
    }

    public boolean isPodcast() {
        return mIsPodcast;
    }
}

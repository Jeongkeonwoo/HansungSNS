package com.example.hansungsns.listener;

import com.example.hansungsns.PostInfo;

public interface OnPostListener {
    void onDelete(PostInfo postInfo);
    void onModify();
}

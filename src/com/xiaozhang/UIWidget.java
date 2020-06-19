package com.xiaozhang;

// interfaces can have multiple parents, while classes cannot
public interface UIWidget extends Draggable, Resizable {
    void render();
}


package hd.com.box

import hd.com.box.Box

class Box5:Box(39.5f,27.5f,23f) {
    override fun getBoxPrice(): Int {
        return 65
    }

    override fun getBoxType(): String {
        return "Box5"
    }
}
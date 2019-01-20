package hd.com.box

import hd.com.box.Box

class Box3 : Box(23f,14f,13f) {
    override fun getBoxPrice(): Int {
        return 110
    }

    override fun getBoxType(): String {
        return "Box3"
    }
}

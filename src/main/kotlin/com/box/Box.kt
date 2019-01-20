package hd.com.box

open  abstract class Box(var length: Float , var  width: Float, var height: Float){



    fun validate(sizeDate :List<Float>) :Boolean = validate(sizeDate.get(0), sizeDate.get(1), sizeDate.get(2))
    fun validate(length :Float , width :Float , height :Float ) : Boolean {
       val _length = if (length > width) length else width
        var _width = if( length > width) width else length
       return _length <= this.length && _width <= this.width && height <= this.height
    }
    abstract fun getBoxPrice() :Int

    abstract fun getBoxType() :String



}
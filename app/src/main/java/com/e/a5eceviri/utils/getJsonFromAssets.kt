package com.e.a5eceviri.utils

import okio.Utf8
import java.io.InputStream
import java.io.UTFDataFormatException

class getJsonFromAssets {
    fun getjson(stream:InputStream):String{
        val size: Int = stream.available()
        val buffer = ByteArray(size)
        stream.read(buffer)
        stream.close()
        var string = String(buffer)
        return string
    }

}
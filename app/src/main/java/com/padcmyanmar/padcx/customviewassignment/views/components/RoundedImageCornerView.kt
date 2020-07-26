package com.padcmyanmar.padcx.customviewassignment.views.components

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.withStyledAttributes
import com.padcmyanmar.padcx.customviewassignment.R

class RoundedImageCornerView(context: Context?, attrs: AttributeSet?) :
    AppCompatImageView(context, attrs) {

    var borderColor = Color.WHITE
    var borderWidth = 0f
    var cornerRadius=0f
    private var path= Path()

    init {
        context?.withStyledAttributes(attrs, R.styleable.RoundedImageCornerView){
            cornerRadius=getDimension(R.styleable.RoundedImageCornerView_corner_radius,0f)
            borderColor=getColor(R.styleable.RoundedImageCornerView_border_color,borderColor)
            borderWidth=getDimension(R.styleable.RoundedImageCornerView_border_width,borderWidth)
        }
    }

    override fun onDraw(canvas: Canvas?) {


        val rectangle = RectF(0f,0f,width.toFloat(),height.toFloat())
        path.addRoundRect(rectangle,cornerRadius,cornerRadius,Path.Direction.CCW)
        canvas?.clipPath(path)
        super.onDraw(canvas)
        drawBorder(canvas)

    }

    private fun drawBorder(canvas: Canvas?){
        var paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint.color=borderColor
        paint.style=Paint.Style.STROKE
        paint.strokeWidth=borderWidth
         var borderRadius =width/2f

        canvas?.drawCircle(width/2f , width/2f , borderRadius - borderWidth /2f ,paint)
    }
}
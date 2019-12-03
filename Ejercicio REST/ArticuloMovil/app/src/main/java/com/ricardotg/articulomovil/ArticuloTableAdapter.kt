package com.ricardotg.articulomovil

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import de.codecrafters.tableview.TableDataAdapter

class ArticuloTableDataAdapter : TableDataAdapter<Articulo> {
    constructor(context: Context, data:List<Articulo>): super(context,data)
    override fun getCellView(rowIndex:Int,columnIndex:Int, parentView: ViewGroup): View? {
        var articulo:Articulo = getRowData(rowIndex)
        var renderedView: View? = null
        var textView = TextView(context)
        when (columnIndex) {
            0 -> {
                textView.text = articulo.claveArticulo
                renderedView =  textView
            }
            1 -> {
                textView.text = articulo.descripcion
                renderedView =  textView
            }
            2 -> {
                textView.text = articulo.precio.toString()
                renderedView =  textView
            }
            3 -> {
                textView.text = articulo.existencias.toString()
                renderedView =  textView
            }
        }
        return renderedView
    }
}
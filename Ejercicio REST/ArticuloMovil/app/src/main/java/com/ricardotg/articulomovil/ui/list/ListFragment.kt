package com.ricardotg.articulomovil.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ricardotg.articulomovil.Articulo
import com.ricardotg.articulomovil.ArticuloTableDataAdapter
import com.ricardotg.articulomovil.R
import com.ricardotg.articulomovil.getArticuloList
import de.codecrafters.tableview.TableDataAdapter
import de.codecrafters.tableview.TableView
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter
import javax.ws.rs.client.Client
import javax.ws.rs.client.ClientBuilder
import javax.ws.rs.core.MediaType


class ListFragment : Fragment() {

    private var header= arrayOf("Clave","Descripcion","Precio","Existencias")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_list, container, false)
        var tableview: TableView<String> = root.findViewById(R.id.tablaArticulos)
        val client: Client = ClientBuilder.newClient()
        val jsonList: String = client.target("http://127.0.0.1:8000/articulos/")
            .request(MediaType.APPLICATION_JSON)
            .get(String::class.java)
        var articulos:List<Articulo> = getArticuloList(jsonList)

        tableview.headerAdapter = SimpleTableHeaderAdapter(root.context,*header)
        tableview.dataAdapter = ArticuloTableDataAdapter(root.context,articulos) as TableDataAdapter<String>
        return root
    }
}
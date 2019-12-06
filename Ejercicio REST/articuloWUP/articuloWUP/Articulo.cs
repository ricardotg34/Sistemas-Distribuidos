// La plantilla de elemento Página en blanco está documentada en https://go.microsoft.com/fwlink/?LinkId=402352&clcid=0xc0a

namespace articuloWUP
{
    public class Articulo
    {
        public string claveArticulo { get; set; }
        public string descripcion { get; set; }
        public decimal precio { get; set; }
        public int existencias { get; set; }
    }
}

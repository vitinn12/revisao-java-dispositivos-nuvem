public class TesteLampada {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor(1, "Pedro lâmpadas");
        Fornecedor fornecedor2 = new Fornecedor(2, "Isac lâmpadas");

        Lampada lampada = new Lampada();
        lampada.setId(2);
        lampada.setTipo("LED");
        lampada.setFornecedor(fornecedor1);

        System.out.println(lampada.getId());
        System.out.println(lampada.getTipo());
        System.out.println(lampada.getEstado());
        System.out.println("Fornecedor id: " + lampada.getFornecedor().getId());
        System.out.println("Fornecedor: " + lampada.getFornecedor().getNome());


        System.err.println("A lampada está: " + lampada.getEstado());     
        lampada.acender();
        System.err.println("A lampada está: " + lampada.getEstado());   
        lampada.apagar();
        System.err.println("A lampada está: " + lampada.getEstado()); 
        
        Lampada lampada2 = new Lampada(1, "LED", fornecedor2);
        //Lampada lampada3 = new Lampada(2, "Fluorescente");
        System.out.println(lampada2.toString());
        //System.out.println(lampada3.toString());
    }   
}

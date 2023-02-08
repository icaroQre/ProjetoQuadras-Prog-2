public class Main {
    public static void main(String[] args) throws Exception {

        Quadra quadra1 = new Quadra();
        Quadra quadra2 = new Quadra();

        Usuario usuario1 = new Usuario ("leonardo", "abacaxi", false);
        Admin admin1 = new Admin("icaro", "123", true)
        GerenciarCadastros cadastro = new GerenciarCadastros();

        cadastro.cadastrarUsuario(usuario1);
        cadastro.cadastrarAdmin(admin1);
    }
}

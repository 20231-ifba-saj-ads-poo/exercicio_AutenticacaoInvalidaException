namespace Exercicios
{
    public class Usuario
    {
        public string Login { get; set; }
        public string Senha { get; set; }
    }

    public class BancoDeUsuarios
    {
        private static List<Usuario> usuarios;

        static BancoDeUsuarios()
        {
            usuarios = new List<Usuario>();
            usuarios.Add(new Usuario { Login = "joao", Senha = "123" });
            usuarios.Add(new Usuario { Login = "maria", Senha = "456" });
        }

        public static void Autenticar(string login, string senha)
        {
            foreach (var usuario in usuarios)
            {
                if (usuario.Login == login && usuario.Senha == senha)
                {
                    Console.WriteLine($"Usuário {login} autenticado com sucesso!");
                    return;
                }
            }
            throw new Exception($"Usuário {login} não foi encontrado ou a senha está errada");
        }
    }

    public static class Program
    {
        public static void Main()
        {
            try
            {
                BancoDeUsuarios.Autenticar("joao", "123");
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }
}
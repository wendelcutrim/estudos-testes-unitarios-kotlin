import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class PortariaTest {
    val acessoNegado = "Negado. Convite inválido.";
    val menorIdade = "Negado. Menores de idade não são permitidos.";
    val acessoSucesso = "Welcome :)";

    @Test
    @DisplayName("portaria do tipo comum e com idade maior de 18 e tipo de código xt")
    fun testPortarioComumComSucesso() {
        val idade: Int = 18;
        val tipo: String = "comum";
        val codigo: String = "xt";
        val expected: String = acessoSucesso;

        val result = portaria(idade, tipo, codigo);

        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Portaria do tipo comum e com idade maior de 18 e tipo de código xl")
    fun testPortarioComumComSucesso2() {
        val idade: Int = 18;
        val tipo: String = "comum";
        val codigo: String = "xl";
        val expected: String = acessoSucesso;

        val result = portaria(idade, tipo, codigo);

        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Portaria do tipo comum e com idade menor de 18 e tipo de código xt")
    fun testPortarioComumMenorIdade() {
        val idade: Int = 17;
        val tipo: String = "comum";
        val codigo: String = "xt";
        val expected: String = menorIdade;

        val result = portaria(idade, tipo, codigo);

        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Portaria do tipo comum, maior idade e tipo de código errado")
    fun testPortarioComumComErro() {
        val idade: Int = 23;
        val tipo: String = "comum";
        val codigo: String = "abc";
        val expected: String = acessoNegado;

        val result = portaria(idade, tipo, codigo);

        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Portaria com tipo de acesso inválido")
    fun testPortariaComTipoInvalido() {
        val idade: Int = 23;
        val tipo: String = "error";
        val codigo: String = "abc";
        val expected: String = acessoNegado;

        val result = portaria(idade, tipo, codigo);

        Assertions.assertEquals(expected, result);
    }
}
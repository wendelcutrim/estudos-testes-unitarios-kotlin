import org.junit.jupiter.api.*
import kotlin.jvm.Throws

class CountXOTest {
    @Test
    @DisplayName("Testa a quantidade de X e O")
    fun testCountXO() {
        Assertions.assertAll({
            Assertions.assertTrue(countXO("xxoo"));
        }, {
            Assertions.assertFalse(countXO("xxxoo"));
        })
    }

    @Test
    @Disabled
    fun naoImplementada() {
        // A annotation disabled, é similar ao skip do jest. Ele vai pular esse teste.
    }

    @Test
    fun vaiFalhar() {
        // Simula uma falha no teste.
        fail("Ainda  não implementado")
    }

    @Test
    fun rodaBaseadoEmCondicao() {
        // Assumir, ou seja, faz uma suposição.
        Assumptions.assumeTrue(countXO("xxoo")) //Diz que qualquer bloco de código abaixo desta linha, só vai rodar se essa linha for true.

        Assertions.assertEquals(true, countXO("xxoo"))
    }

    @Test
    fun testLancaExcessao() {
        assertThrows<Exception> {
            throw Exception("Ocorreu um erro!")
        }
    }

    @Test
    fun testNotNull() {
        Assertions.assertNotNull(countXO("sakjdkalsdasl"))
    }
}
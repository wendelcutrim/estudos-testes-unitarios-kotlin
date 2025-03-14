fun portaria(idade: Int, tipo: String, codigo: String): String {
    val tipoAcesso: Array<String> = arrayOf("comum", "premium", "luxo")

    if (idade < 18) {
        return "Negado. Menores de idade não são permitidos."
    }

    if (!tipoAcesso.contains(tipo)) {
        return "Negado. Convite inválido."
    }

    return if (tipo == "comum" && codigo.startsWith("xt")) {
        "Welcome :)"
    } else if (codigo.startsWith("xl")) {
        "Welcome :)"
    } else {
        "Negado. Convite inválido."
    }
}
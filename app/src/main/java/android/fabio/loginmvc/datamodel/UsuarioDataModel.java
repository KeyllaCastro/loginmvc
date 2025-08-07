package android.fabio.loginmvc.datamodel;

import android.util.Log;

public class UsuarioDataModel {
    //atributo com nome da tabela
    public static final String TABELA = "usuario";
    //atributos 1 para 1
    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String EMAIL = "emial";
    public static final String SENHA = "semha";

    public static  String queryCriarTabela = "";

    public static String criarTabela(){
        queryCriarTabela += "CREATE TABLE " + TABELA  + "(";
        queryCriarTabela += ID + " int primary key autoincrement";
        queryCriarTabela += NOME + " text, ";
        queryCriarTabela += EMAIL + " text, ";
        queryCriarTabela += SENHA + " text, ";
        queryCriarTabela += ")";

            Log.i("tabela", "criarTabela: " + queryCriarTabela);
        return  queryCriarTabela;


    }
}

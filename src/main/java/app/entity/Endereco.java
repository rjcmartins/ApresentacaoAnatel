
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela ENDERECO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"ENDERECO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Endereco")
@EntityListeners({cronapi.database.HistoryListener.class})
@CronappTable(role=CronappTableRole.CLASS)
public class Endereco implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Logradouro")
    @Column(name = "Logradouro", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String Logradouro;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Bairro")
    @Column(name = "Bairro", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String Bairro;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="UF")
    @Column(name = "UF", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String UF;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Casa")
    @Column(name = "Casa", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String Casa;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CEP")
    @Column(name = "CEP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String CEP;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_aluno", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Aluno aluno;


    /**
    * Construtor
    * @generated
    */
    public Endereco(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Endereco setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém Logradouro
    * return Logradouro
    * @generated
    */
    public java.lang.String getLogradouro() {
        return this.Logradouro;
    }

    /**
    * Define Logradouro
    * @param Logradouro Logradouro
    * @generated
    */
    public Endereco setLogradouro(java.lang.String Logradouro) {
        this.Logradouro = Logradouro;
        return this;
    }
    /**
    * Obtém Bairro
    * return Bairro
    * @generated
    */
    public java.lang.String getBairro() {
        return this.Bairro;
    }

    /**
    * Define Bairro
    * @param Bairro Bairro
    * @generated
    */
    public Endereco setBairro(java.lang.String Bairro) {
        this.Bairro = Bairro;
        return this;
    }
    /**
    * Obtém UF
    * return UF
    * @generated
    */
    public java.lang.String getUF() {
        return this.UF;
    }

    /**
    * Define UF
    * @param UF UF
    * @generated
    */
    public Endereco setUF(java.lang.String UF) {
        this.UF = UF;
        return this;
    }
    /**
    * Obtém Casa
    * return Casa
    * @generated
    */
    public java.lang.String getCasa() {
        return this.Casa;
    }

    /**
    * Define Casa
    * @param Casa Casa
    * @generated
    */
    public Endereco setCasa(java.lang.String Casa) {
        this.Casa = Casa;
        return this;
    }
    /**
    * Obtém CEP
    * return CEP
    * @generated
    */
    public java.lang.String getCEP() {
        return this.CEP;
    }

    /**
    * Define CEP
    * @param CEP CEP
    * @generated
    */
    public Endereco setCEP(java.lang.String CEP) {
        this.CEP = CEP;
        return this;
    }
    /**
    * Obtém aluno
    * return aluno
    * @generated
    */
    public Aluno getAluno() {
        return this.aluno;
    }

    /**
    * Define aluno
    * @param aluno aluno
    * @generated
    */
    public Endereco setAluno(Aluno aluno) {
        this.aluno = aluno;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Endereco object = (Endereco)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}
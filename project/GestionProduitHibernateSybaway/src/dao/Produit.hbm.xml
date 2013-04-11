<?xml version="1.0"?>
<!DOCTYPE hibernate-mapping PUBLIC
	"-//Hibernate/Hibernate Mapping DTD 3.0//EN"
	"http://hibernate.sourceforge.net/hibernate-mapping-3.0.dtd">
<hibernate-mapping>

<class name="dao.Produit" table="PRODUITS" >

	<id name="idProduit" column="ID_PRODUIT"  >
		<generator class="native"></generator>
	</id>
	
	<property name="nom" column="NOM"></property>
	<property name="description" column="DESCRIPTION"></property>
	<property name="prix" column="PRIX"></property>
	
	<set name="categories" table="CAT_PROD" inverse="true" lazy="false">
		<key column="ID_PRODUIT" ></key>
		<many-to-many class="dao.Categorie" column="ID_CATEGORIE" > </many-to-many>
	</set>
	
</class>
 
  
</hibernate-mapping>
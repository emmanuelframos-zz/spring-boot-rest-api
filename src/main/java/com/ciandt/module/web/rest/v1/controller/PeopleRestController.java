package com.ciandt.module.web.rest.v1.controller;

import com.ciandt.module.web.rest.v1.resource.PeopleResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PeopleRestController {

    @RequestMapping(value = "/people", method = RequestMethod.GET)
    public ResponseEntity<List<PeopleResource>> getPeople() {

        List<PeopleResource> people = new ArrayList();

        people.add(PeopleResource.build()
                .name("Marcos Vidolin")
                .age(27)
                .birthDate("1989/05/11")
                .skill("Docker")
                .photoUrl("http://citweb.cit.com.br/ipeople/photo?cdLogin=mvidolin")
                .salary("5000")
        );

        people.add(PeopleResource.build()
                .name("José Reinaldo")
                .age(29)
                .birthDate("1987/10/13")
                .skill(".Net")
                .photoUrl("http://citweb.cit.com.br/ipeople/photo?cdLogin=josef")
                .salary("7000")
        );

        people.add(PeopleResource.build()
                .name("Emmanuel Ramos")
                .age(31)
                .birthDate("1985/11/29")
                .skill("Angular")
                .photoUrl("http://citweb.cit.com.br/ipeople/photo?cdLogin=emmanuelf")
                .salary("4500.46")
        );

        people.add(PeopleResource.build()
                .name("Luiz Souza")
                .age(24)
                .birthDate("1992/09/05")
                .skill("Java")
                .photoUrl("http://citweb.cit.com.br/ipeople/photo?cdLogin=luizsj")
                .salary("6900.34")
        );

        people.add(PeopleResource.build()
                .name("Alan Thiago")
                .age(31)
                .birthDate("1985/09/23")
                .skill("C#")
                .photoUrl("http://citweb.cit.com.br/ipeople/photo?cdLogin=alan")
                .salary("4000")
        );

        people.add(PeopleResource.build()
                .name("Gilberto Prado")
                .age(27)
                .birthDate("1988/09/23")
                .skill("CSS")
                .photoUrl("http://citweb.cit.com.br/ipeople/photo?cdLogin=gilbertopj")
                .salary("7600")
        );

        people.add(PeopleResource.build()
                .name("Ricardo Bastos")
                .age(27)
                .birthDate("1988/02/23")
                .skill("Struts")
                .photoUrl("http://citweb.cit.com.br/ipeople/photo?cdLogin=rbastos")
                .salary("")
        );

        people.add(PeopleResource.build()
                .name("Caio Peres")
                .age(36)
                .birthDate("1980/04/08")
                .skill("Java")
                .photoUrl("http://citweb.cit.com.br/ipeople/photo?cdLogin=cperes")
                .salary("8000")
        );

        people.add(PeopleResource.build()
                .name("Amanda Dianni")
                .age(35)
                .birthDate("1981/04/08")
                .skill("Spring")
                .photoUrl("http://citweb.cit.com.br/ipeople/photo?cdLogin=amandac")
                .salary("6300")
        );

        people.add(PeopleResource.build()
                .name("Ederson Andrey")
                .age(31)
                .birthDate("1985/04/08")
                .skill("Asp MVC")
                .photoUrl("http://citweb.cit.com.br/ipeople/photo?cdLogin=ederson")
                .salary("9000")
        );

        people.add(PeopleResource.build()
                .name("Getulio Trevisan")
                .age(34)
                .birthDate("1982/04/08")
                .skill("JSF")
                .photoUrl("http://citweb.cit.com.br/ipeople/photo?cdLogin=gtrevisan")
                .salary("4600")
        );

        people.add(PeopleResource.build()
                .name("Vinicius Nogueira")
                .age(33)
                .birthDate("1983/04/08")
                .skill("Java")
                .photoUrl("http://citweb.cit.com.br/ipeople/photo?cdLogin=vnogueira")
                .salary("3800")
        );

        people.add(PeopleResource.build()
                .name("Marcos Pellini")
                .age(32)
                .birthDate("1984/04/08")
                .skill("JavaScript")
                .photoUrl("http://citweb.cit.com.br/ipeople/photo?cdLogin=mpellini")
                .salary("10000")
        );

        people.add(PeopleResource.build()
                .name("Vinicius Pfeifer")
                .age(30)
                .birthDate("1986/04/08")
                .skill("C#")
                .photoUrl("http://citweb.cit.com.br/ipeople/photo?cdLogin=vpfeifer")
                .salary("6666.66")
        );

        return new ResponseEntity<>(people, HttpStatus.OK);
    }
}
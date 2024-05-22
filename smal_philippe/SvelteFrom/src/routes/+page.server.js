export const csr = true; // csr attivo
export const ssr = true; //ssr attivo
import Database from 'better-sqlite3';

const db = new Database('User.db', {verbose: console.log});

export function load({ params }) {
    console.log("ESECUIONE FUNZIONE LOAD:", Date.now());    

    const query1 = db.prepare('SELECT * FROM utente');
    const res = query1.all();
    console.log(res)

    return { 
        utenti: res }   
}


export const actions = {
    create: async ({cookies, request}) => {
        const data = await request.formData();
        console.log("I valori  del form sono : ", data)

        const query2 = db.prepare("INSERT INTO utente (nome, cognome, eta) VALUES (@nome, @cognome, @eta) ")

        const user = {
            nome: data.get('nome'),
            cognome: data.get('cognome'),
            eta: data.get('eta'),
        }

        if(user.nome && user.cognome && user.eta) {
            const res2 = query2.run({
                nome: user.nome,
                cognome: user.cognome,
                eta: +user.eta // "+" converte da str to int
            })
        }
        else {
            return {
                form_error: true,
                form_vals: user
            }
        }
    },
    update: async ({cookies, request}) => {
        const data = await request.formData();
        console.log("UPDATE ACTION")
        console.log("I valori  del form sono : ", data)

        const query3 = db.prepare(
            "UPDATE utente SET nome=@nome, cognome=@cognome, eta=@eta WHERE id=@id")

        const user2 = {
            id: data.get("id"),
            nome: data.get("nome"),
            cognome: data.get("cognome"),
            eta: data.get("eta"),
        }

        console.log(user2)

        if(user2.nome && user2.cognome && user2.eta) {
            const res3 = query3.run(
                user2
            )
        }
        else {
            return {
                form_error: true,
                form_vals: user
            }
        }
    },
    delete: async ({cookies, request}) => {
        const data = await request.formData();
        console.log("DELETE ACTION")
        console.log("I valori  del form sono : ", data)

        const query4 = db.prepare(
            "DELETE FROM utente WHERE id = ?")

        const res4 = query4.run(+data.get("id"))

    }
}
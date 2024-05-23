export const csr = true;
export const ssr = true;
import Database from 'better-sqlite3';

const db = new Database('USER.db', { verbose: console.log });

export function load({ params }) {
    console.log("ESECUIONE FUNZIONE LOAD:", Date.now());
    
    const query1 = db.prepare("SELECT * FROM utente");
    const res1 = query1.all();

    return { utenti: res1 };
}

export const actions = {
    create: async ({ cookies, request }) => {
        const data = await request.formData();
        console.log("CREATE ACTION")
        console.log("I dati sono:", data);

        const query2 = db.prepare("INSERT INTO utente (nome, cognome, eta) VALUES(@nome, @cognome, @anni)");

        const user = {
                nome: data.get("nome"),
                cognome: data.get("cognome"),
                eta: data.get("eta")
        }

        if (user.nome && user.cognome && user.eta) {
            const res2 = query2.run({
                nome: user.nome,
                cognome: user.cognome,
                anni: +user.eta
            });
        } else {
            return {
                form_error: true,
                form_vals: user
            }
        }
    },

    update: async ({ cookies, request }) => {
        const data = await request.formData();
        console.log("UPDATE ACTION")
        console.log("I dati sono:", data);

        const query3 = db.prepare("UPDATE utente SET nome=@nome, cognome=@cognome, eta=@anni WHERE id=@id");

        const user = {
            id: data.get("id"),
            nome: data.get("nome"),
            cognome: data.get("cognome"),
            eta: data.get("eta"),
        }

        if (user.nome && user.cognome && user.eta) {
            const res3 = query3.run({
                id: +user.id,
                nome: user.nome,
                cognome: user.cognome,
                anni: +user.eta,
            });
        } else {
            return {
                form_error: true,
                form_vals: user,
            }
        }
    },

    delete: async ({ cookies, request }) => {
        const data = await request.formData();
        console.log("DELETE ACTION");
        console.log("I dati sono:", data);

        const query4 = db.prepare(
            "DELETE FROM utente WHERE id = ?"
        );
        const res4 = query4.run(+data.get("id"));
    }
};
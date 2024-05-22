import Database from "better-sqlite3"
const db = new Database("database.db", { verbose: console.log })

export function load({ params }) {
    console.log("ESECUZIONE LOAD:", Date.now());

    const query1 = db.prepare("SELECT * FROM utenti");
    const res1 = query1.all();

    return {
        utenti: res1,
    };
}

export const actions = {
    create: async({ cookies, request }) => {
        const data = await request.formData()
        console.log("CREATE ACTION");
        console.log("I VALORI DEL FORM SONO: ", data);

        const query2 = db.prepare("INSERT INTO utenti (nome, cognome, eta) VALUES(@nome, @cognome, @eta)");

        const user = {
            nome: data.get("nome"),
            cognome: data.get("cognome"),   
            eta: data.get("eta")
        }

        if (user.nome && user.cognome && user.eta) {
            const res2 = query2.run({
                nome: user.nome,
                cognome: user.cognome,
                eta: user.eta
            })
        } else {
            return {
                form_error: true,
                form_vals: user
            }
        }
    },

    update: async ({ cookies, request }) => {
        const data = await request.formData();
        console.log("UPDATE ACTION");
        console.log("I VALORI DEL FORM SONO:", data);

        const query3 = db.prepare("UPDATE utenti SET nome=@nome, cognome=@cognome, eta=@eta WHERE id=@id");
        const user = {
            id: data.get("id"),
            nome: data.get("nome"),
            cognome: data.get("cognome"),
            eta: data.get("eta"),
        };
        if(user.nome && user.cognome && user.eta) {
            console.log("CIAO");
            const res3 = query3.run({
                id: +user.id,
                nome: user.nome,
                cognome: user.cognome,
                eta: +user.eta,
            });
        } else {
            console.log("CIAO2");
            return {
                form_error: true,
                form_vals: user,
            };
        }
    },

    delete: async ({ cookies, request}) => {
        const data = await request.formData();
        console.log("DELETE ACTION");
        console.log("I VALORI DEL FORM SONO:", data);

        const query4 = db.prepare("DELETE FROM utenti WHERE id = ?")
        const res4 = query4.run(+data.get("id"));   
    }
}
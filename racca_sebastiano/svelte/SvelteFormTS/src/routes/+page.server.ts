export const csr = true;
export const ssr = true;

import Database from 'better-sqlite3';
import type { User } from '$lib/types/User';

const db = new Database('user.db', { verbose: console.log });

function getUser(data: FormData): User {
    let id = data.get('id');
    let eta = data.get('eta');

    const user: User = {
        id: id ? +id.toString() : undefined,
        nome: data.get('nome')?.toString(),
        cognome: data.get('cognome')?.toString(),
        eta: eta ? +eta.toString() : undefined,
    };

    return user;
}

export function load() {
    console.log("ESECUIONE FUNZIONE LOAD:", Date.now());
    const select = db.prepare("SELECT * FROM Utente");

    const utenti: User[] = select.all() as User[];

    return { utenti };
}

export const actions = {
    create: async ({ request }) => {
        const data = await request.formData();
        console.log("[CREATE]FORM: ", data);

        const create = db.prepare("INSERT INTO Utente (nome, cognome, eta) VALUES(@nome, @cognome, @eta)");

        const user: User = getUser(data);
        
        if(!(user.nome && user.cognome && user.eta)) {
            return {
                error: true,
                data: user
            };
        }

        create.run(user);
    },

    update: async ({ request }) => {
        const data = await request.formData();
        console.log("[UPDATE]FORM: ", data);

        const update = db.prepare("UPDATE Utente SET nome=@nome, cognome=@cognome, eta=@eta WHERE id=@id");

        const user: User = getUser(data);

        if(!(user.id && user.nome && user.cognome && user.eta)) {
            return {
                error: true,
                data: user
            };
        }

        update.run({
            id: +user.id,
            nome: user.nome,
            cognome: user.cognome,
            eta: +user.eta,
        });
    },

    delete: async ({ request }) => {
        const data = await request.formData();
        console.log("[DELETE]FORM: ", data);

        const deleteQuery = db.prepare("DELETE FROM Utente WHERE id=?");
        const user: User = getUser(data);

        deleteQuery.run(user.id);
    }
}

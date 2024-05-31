<script lang="ts">
    export let data;
    export let form;

    import type { User } from '$lib/types/User';

    let action: 'create' | 'update' = 'create';
    let user: User = {};

    if(form?.data) {
        user.nome = form.data.nome?.toString();
        user.cognome = form.data.cognome?.toString();
        user.eta = form.data.eta ? +form.data.eta.toString() : undefined;
    }

    function edit_user(u: User) {
        action = 'update';
        user = u;
    }
</script>

<div class="container">
    <h1>Welcome to SvelteKit FORM Example</h1>

    <form method="post" action="?/{action}">
        {#if action === 'update'}
            <input type="hidden" name="id" bind:value={user.id}>
        {/if}

        <div><label for="nome">Nome:</label></div>
        <div><input type="text" id="nome" name="nome" size="40" bind:value={user.nome}></div>
        <div><label for="cognome">Cognome:</label></div>
        <div><input type="text" id="cognome" name="cognome" size="40" bind:value={user.cognome}></div>
        <div><label for="eta">Età:</label></div>
        <div><input type="text" id="eta" name="eta" size="40" bind:value={user.eta}></div>
        <div><button type="submit">Invia</button></div>
    </form>

    <p class:hidden={!(form?.error)}>Dati del form invalidi</p>

    <table>
        <thead>
            <tr>
                <td>ID</td>
                <td>Nome</td>
                <td>Cognome</td>
                <td>Età</td>
                <td>Edit</td>
                <td>Remove</td>
            </tr>
        </thead>
        <tbody>
            {#each data.utenti as utente}
                <tr>
                    <td>{utente.id}</td>
                    <td>{utente.nome}</td>
                    <td>{utente.cognome}</td>
                    <td>{utente.eta}</td>
                    <td>
                        <button class="edit" on:click={() => edit_user(utente)}>Edit</button>
                    </td>
                    <td>
                        <form action="?/delete" method="post">
                            <input type="hidden" name="id" value="{utente.id}">
                            <button class="remove">Remove</button>
                        </form>
                    </td>
                </tr>
            {/each}
        </tbody>
    </table>
</div>

<style>
    p {
        color: red;
        font-weight: bold;
    }

    .hidden {
        display: none;
    }

    .container {
        width: 45%;
        margin: auto;
    }

    table, td {
        border: 1px solid black;
        border-collapse: collapse;
        padding: 10px;
        margin-top: 50px;
    }

    thead {
        font-size: 20px;
        font-weight: bolder;
    }

    .edit, .remove {
        color: white;
        background-color: green;
        border-color: green;
        border-radius: 5px;
        width: 100px;
        padding: 5px;
        font-weight: bolder;    
    }

    .remove {
        background-color: red;
        border-color: red;
    }
</style>
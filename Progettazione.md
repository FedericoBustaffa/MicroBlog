[PROGETTAZIONE_MICROBLOG]

# Dati
Post:
    [Metadati]
        id: identificatore univoco, [intero]
        author: utente della rete sociale che ha scritto il post [stringa]
        text: testo del post (massimo 140 caratteri) [stringa]
        timestamp: data e ora di invio del post [datatime??]
        likes: lista degli utenti della rete sociale che hanno messo like
    [Metodi]
        ...

User:
    [Metadati]
        username: nome dell'utente (unico per rete sociale) [stringa]
        post_list: lista di tutti i post pubblicati dall'utente
    [Metodi]
        ...

SocialNetwork:
    [Metadati]
        ...
    [Metodi]
        ...

# Considerazioni
    1. Seguire un utente significa mettergli almeno 1 like ad un post
    
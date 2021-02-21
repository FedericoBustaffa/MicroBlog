[PROGETTAZIONE_MICROBLOG]


# Dati #

Post:
    [Metadati]
        id: identificatore univoco, [int]
        author: utente della rete sociale che ha scritto il post [String]
        text: testo del post (massimo 140 caratteri) [String]
        timestamp: data e ora di invio del post [Date]
        likes: lista degli utenti della rete sociale che hanno messo like [Set<String>]


User:
    [Metadati]
        username: nome dell'utente (unico per rete sociale) [stringa]
        post_list: lista di tutti i post pubblicati dall'utente


SocialNetwork:
    [Metadati]



# Considerazioni
    1. Seguire un utente significa mettergli almeno 1 like ad un post
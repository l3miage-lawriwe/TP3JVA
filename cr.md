Questions

    Avez-vous remarqué quelque-chose avec les fonctions par interpolation ?
    les fonctions par interpolation se comportent bien comme expliqué en cour. il n'y a pas besoin de définir le corp de la fonction manuellement

    A votre avis, quelle est la manière la plus efficace pour récupérer et mettre en relation plusieurs éléments entre eux ?
    par référence, en chargeant les ID.


    Ici, Les components renvoient directement les entités, pensez-vous que cela soit une bonne chose ? Sinon, quelle serait la bonne méthode ?
    l'on aurai pu renvoier les données (name, title, etc . . . ) et non l'entitée entière 

    Si je supprime un artiste, que se passe-t-il ?
    il disparait de la base avec toutes les relations auquel il est attaché.

    Si je récupère une playlist, est-ce que toute l'entité est chargée ?
    dans le cas ou l'on utilise getPlaylist, cela devrait ête le cas oui. 
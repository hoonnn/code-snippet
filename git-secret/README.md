  gpg --gen-key
  gpg -k
  gpg -armor --export 9964FC64037370F6F8D010250514F10F1AC71D78 > public.gpg
  gpg -K
  gpg -armor --export-secret-key 9964FC64037370F6F8D010250514F10F1AC71D78 > secret.gpg

  git secret init
  get secret tell test@test.test
  echo "my-new-password" > password
  echo "git-secret/password" >> ../.gitignore
  git secret add password
  git secret hide -d
  git secret reveal

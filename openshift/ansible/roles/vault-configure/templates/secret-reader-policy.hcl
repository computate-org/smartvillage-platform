# read secrets
path "/\{\{identity.entity.aliases.{{ VAULT_SYS_AUTH.data['kubernetes/'].accessor }}.metadata.service_account_namespace\}\}/kv/*" {
  capabilities = [ "read" ]
}

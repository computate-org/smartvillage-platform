# query existing mounts
path "/sys/mounts" {
  capabilities = [ "list", "read"]
  allowed_parameters = {
    "type" = ["database"]
    "*"   = []
  }
}
# mount database kv engines
path "/sys/mounts/\{\{identity.entity.aliases.{{ VAULT_SYS_AUTH.data['kubernetes/'].accessor }}.metadata.service_account_namespace\}\}/kv" {
  capabilities = [ "create", "read", "update", "delete", "list" ]
  allowed_parameters = {
    "type" = ["kv"]
    "*"   = []
  }
}
# tune database secrets engines
path "/sys/mounts/\{\{identity.entity.aliases.{{ VAULT_SYS_AUTH.data['kubernetes/'].accessor }}.metadata.service_account_namespace\}\}/kv/tune" {
  capabilities = [ "create", "read", "update", "delete"]
}

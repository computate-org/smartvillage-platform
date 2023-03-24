# create secrets
path "/\{\{identity.entity.aliases.{{ VAULT_SYS_AUTH.data['kubernetes/'].accessor }}.metadata.service_account_namespace\}\}/kv/*" {
  capabilities = [ "read", "create", "update", "delete" ]
}
# generate new password from password policy
path "/sys/policies/password/+/generate" {
  capabilities = [ "read" ]
}

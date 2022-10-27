
# Release Notes

- [ 1.0.1 - Mon Oct 26, 2022 ](1.0.1-release-notes.md)
- [ 1.0.0 - Mon Oct 24, 2022 ](1.0.0-release-notes.md)

# To install a new version: 

```bash
# Example vim command to replace versions :%s/1\.0\.x/1.0.y/g

cd ~/.local/src/smartabyar-smartvillage
vim pom.xml # Update version to 1.0.1 in pom.xml. 
vim release/1.0.1-release-notes.md # Add a new release note for the new version. 
vim release/README.md # Update release/README.md with new version. 
git add -i
git commit
git push
git status
mvn clean install deploy -Pdeploy
git tag 1.0.1
git push --tags
```

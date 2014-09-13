package com.wordnik.swagger.models;

import com.wordnik.swagger.models.Model;

import com.fasterxml.jackson.annotation.*;

import java.util.*;

public class Swagger {
  protected Float swagger = 2.0f;
  protected Info info;
  protected String host;
  protected String basePath;
  protected List<Scheme> schemes;
  protected List<String> consumes;
  protected List<String> produces;
  protected Map<String, Path> paths;
  protected List<Security> security;
  protected Map<String, Model> definitions;

  public Swagger info(Info info) {
    this.setInfo(info);
    return this;
  }
  public Swagger host(String host) {
    this.setHost(host);
    return this;
  }
  public Swagger basePath(String basePath) {
    this.setBasePath(basePath);
    return this;
  }
  public Swagger schemes(List<Scheme> schemes) {
    this.setSchemes(schemes);
    return this;
  }
  public Swagger scheme(Scheme scheme) {
    this.addScheme(scheme);
    return this;
  }
  public Swagger consumes(List<String> consumes) {
    this.setConsumes(consumes);
    return this;
  }
  public Swagger consumes(String consumes) {
    this.addConsumes(consumes);
    return this;
  }
  public Swagger produces(List<String> produces) {
    this.setProduces(produces);
    return this;
  }
  public Swagger produces(String produces) {
    this.addProduces(produces);
    return this;
  }
  public Swagger paths(Map<String, Path> paths) {
    this.setPaths(paths);
    return this;
  }
  public Swagger path(String key, Path path) {
    if(this.paths == null)
      this.paths = new LinkedHashMap<String, Path>();
    this.paths.put(key, path);
    return this;
  }
  public Swagger security(List<Security> security) {
    this.setSecurity(security);
    return this;
  }
  public Swagger security(Security security) {
    this.addSecurity(security);
    return this;
  }
  public Swagger model(String name, Model model) {
    this.addDefinition(name, model);
    return this;
  }

  public Float getSwagger() {
    return swagger;
  }
  public void setSwagger(Float swagger) {
    this.swagger = swagger;
  }

  public Info getInfo() {
    return info;
  }
  public void setInfo(Info info) {
    this.info = info;
  }

  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }

  public String getBasePath() {
    return basePath;
  }
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  @JsonIgnore
  public List<Scheme> getSchemes() {
    return schemes;
  }
  public void setSchemes(List<Scheme> schemes) {
    this.schemes = schemes;
  }
  public void addScheme(Scheme scheme) {
    if(this.schemes == null)
      this.schemes = new ArrayList<Scheme>();
    this.schemes.add(scheme);
  }

  public List<String> getConsumes() {
    return consumes;
  }
  public void setConsumes(List<String> consumes) {
    this.consumes = consumes;
  }
  public void addConsumes(String consumes) {
    if(this.consumes == null)
      this.consumes = new ArrayList<String>();
    this.consumes.add(consumes);
  }

  public List<String> getProduces() {
    return produces;
  }
  public void setProduces(List<String> produces) {
    this.produces = produces;
  }
  public void addProduces(String produces) {
    if(this.produces == null)
      this.produces = new ArrayList<String>();
    this.produces.add(produces);
  }

  public Map<String, Path> getPaths() {
    Map<String, Path> sorted = new LinkedHashMap<String, Path>();
    List<String> keys = new ArrayList<String>();
    keys.addAll(paths.keySet());
    Collections.sort(keys);

    for(String key: keys) {
      sorted.put(key, paths.get(key));
    }
    return sorted;
  }
  public void setPaths(Map<String, Path> paths) {
    this.paths = paths;
  }
  public Path getPath(String path) {
    if(this.paths == null)
      return null;
    return this.paths.get(path);
  }

  public List<Security> getSecurity() {
    return security;
  }
  public void setSecurity(List<Security> security) {
    this.security = security;
  }
  public void addSecurity(Security security) {
    if(this.security == null)
      this.security = new ArrayList<Security>();
    this.security.add(security);
  }

  public void setDefinitions(Map<String, Model> definitions) {
    this.definitions = definitions;
  }
  public Map<String, Model> getDefinitions() {
    return definitions;
  }
  public void addDefinition(String key, Model model) {
    if(this.definitions == null)
      this.definitions = new HashMap<String, Model>();
    this.definitions.put(key, model);
  }
}
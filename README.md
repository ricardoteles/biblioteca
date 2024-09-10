### Diagrama Entidade-Relacionamento (ER)

#### Entidades e Relacionamentos:

1. **Autor**
   - `id` (PK)
   - `nome`
   - `perfil_id` (FK)

2. **Perfil**
   - `id` (PK)
   - `biografia`
   - `data_nascimento`

3. **Livro**
   - `id` (PK)
   - `titulo`
   - `autor_id` (FK)

4. **Categoria**
   - `id` (PK)
   - `nome`

5. **Livro_Categoria** (Tabela de junção)
   - `livro_id` (FK)
   - `categoria_id` (FK)

#### Relacionamentos:

- **OneToOne**: `Autor` → `Perfil`
  - Cada `Autor` tem um `Perfil`, e cada `Perfil` pertence a um `Autor`.

- **ManyToOne**: `Livro` → `Autor`
  - Cada `Livro` é escrito por um `Autor`, mas um `Autor` pode escrever vários `Livros`.

- **ManyToMany**: `Livro` ↔ `Categoria`
  - Cada `Livro` pode estar em várias `Categorias`, e cada `Categoria` pode incluir vários `Livros`.

### Representação Gráfica

Aqui está uma representação gráfica básica dos relacionamentos:

```plaintext
[Autor] 1 ---------- 1 [Perfil]

  |                           |
  |                           |
  |                           |
  |                           |
  |                           |
  |                           |
  |                           |
  V                           V

[Livro] N ---------- M [Categoria]
```

#### Descrição da Figura

- **[Autor]** e **[Perfil]**: Relacionamento OneToOne (um autor tem exatamente um perfil, e cada perfil pertence a um único autor).
- **[Livro]** e **[Autor]**: Relacionamento ManyToOne (muitos livros podem ser escritos por um único autor, mas cada livro tem apenas um autor).
- **[Livro]** e **[Categoria]**: Relacionamento ManyToMany (um livro pode ter várias categorias e uma categoria pode incluir vários livros).

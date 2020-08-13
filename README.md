# Chess System in Java

## First class: Position

**Checklist:**
  - Class Position [public]
  - **OOP Topics:**
    - Encapsulation
    - Constructors
    - ToString (Object/overriding)

## Starting to implement Board and Piece

**Checklist:**
  - Classes Piece, Board [public]
  - **OOP Topics:**
    - Associations
    - Encapsulation / Access Modifiers
  - **Data Structures Topics:**
    - Matrix

## Chess layer and printing the board

    8 - - - - - - - -
    7 - - - - - - - -
    6 - - - - - - - -
    5 - - - - - - - -
    4 - - - - - - - -
    3 - - - - - - - -
    2 - - - - - - - -
    1 - - - - - - - -
      a b c d e f g h

**Checklist:**
  - Methods: Board.Piece(row, column) and Board.Piece(position)
  - Enum Chess.Color
  - Class Chess.ChessPiece [public]
  - Class Chess.ChessMatch [public]
  - Class ChessConsole.UI
  - **OOP Topics:**
    - Enumerations
    - Encapsulation / Access Modifiers
    - Inheritance
    - Downcasting
    - Static members
    - Layers pattern
  - **Data Structures Topics:**
    - Matrix

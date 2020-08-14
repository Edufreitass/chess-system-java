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

## Placing pieces on the board
  
  **Checklist:**
  - Method: Board.PlacePiece(piece, position)
  - Classes: Rook, King [public]
  - Method: ChessMatch.InitialSetup
  - **OOP Topics:**
    - Inheritance
    - Overriding
    - Polymorphism (ToString)

## BoardException and defensive programming

  **Checklist:**
  - Class BoardException [public]
  - Methods: Board.PositionExists, Board.ThereIsAPiece
  - Implement defensive programming in Board methods
  - **OOP Topics:**
    - Exceptions
    - Constructors (a string must be informed to the exception)

## ChessException and ChessPosition

  **Checklist:**
  - Class ChessException [public]
  - Class ChessPosition [public]
  - Refactor ChessMatch.InitialSetup
  - **OOP Topics:**
    - Exceptions
    - Encapsulation
    - Constructors (a string must be informed to the exception)
    - Overriding
    - Static members
    - Layers pattern

## Little improvement in board printing

**Color in terminal:**
  - Windows: Git Bash
  - Mac: Google "osx terminal color"
    
**Checklist:**
  - Place more pieces on the board
  - Distinguish piece colors in UI.PrintPiece method

## Moving pieces

**Checklist:**
- Method Board.RemovePiece
- Method UI.ReadChessPosition
- Method ChessMatch.PerformChessMove
  - Method ChessMatch.MakeMove
  - Method ChessMatch.ValidadeSourcePosition
- Write basic logic on Program.cs
- **OOP Topics:**
  - Exceptions
  - Encapsulation
